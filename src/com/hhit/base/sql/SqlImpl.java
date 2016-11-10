package com.hhit.base.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import javax.sql.DataSource;




public class SqlImpl  implements Sql {
	
	 private static final ThreadLocal<Connection> CONNECTION = new ThreadLocal();
	 /*  26 */   private static final ThreadLocal<Set<PreparedStatement>> PREPARED_STATEMENT = new ThreadLocal();
	 /*  27 */   private static final ThreadLocal<Set<ResultSet>> RESULT_SET = new ThreadLocal();
	 /*     */ 
	 /*     */   @Resource(name="dao.dataSource")
	 /*     */   private DataSource dataSource;
	 /*     */ 
	 /*     */ 
	 /*  38 */   public ResultSet query(String sql, Object[] args) throws SQLException { if (RESULT_SET.get() == null) {
	 /*  39 */       RESULT_SET.set(new HashSet());
	 /*     */     }
	 /*  41 */     PreparedStatement pstmt = prepareStatement(sql);
	 /*  42 */     if (args.length>0)
	 /*  43 */       for (int i = 0; i < args.length; i++)
	 /*  44 */         pstmt.setObject(i + 1, args[i]);
	 /*  45 */     ResultSet rs = pstmt.executeQuery();
	 /*     */ 
	 /*  47 */     ((Set)RESULT_SET.get()).add(rs);
	 /*     */ 
	 /*  49 */     return rs; }
	 /*     */ 
	 /*     */   public void update(String sql, Object[] args)
	 /*     */     throws SQLException
	 /*     */   {
	 /*  54 */     
	 /*  57 */     PreparedStatement pstmt = prepareStatement(sql);
	 /*  58 */     if (args.length>0)
	 /*  59 */       for (int i = 0; i < args.length; i++)
	 /*  60 */         pstmt.setObject(i + 1, args[i]);
	 /*  61 */     pstmt.executeUpdate();
	 /*     */   }
	 /*     */ 
	 /*     */   private Connection connection() throws SQLException {
	 /*  65 */     if (CONNECTION.get() == null) {
	 /*  66 */       CONNECTION.set(this.dataSource.getConnection());
	 /*     */     }
	 /*  68 */     return (Connection)CONNECTION.get();
	 /*     */   }
	 /*     */ 
	 /*     */   private PreparedStatement prepareStatement(String sql) throws SQLException {
	 /*  72 */     if (PREPARED_STATEMENT.get() == null) {
	 /*  73 */       PREPARED_STATEMENT.set(new HashSet());
	 /*     */     }
	 /*  75 */     PreparedStatement pstmt = connection().prepareStatement(sql);
	 /*     */ 
	 /*  77 */     ((Set)PREPARED_STATEMENT.get()).add(pstmt);
	 /*     */ 
	 /*  79 */     return pstmt;
	 /*     */   }
	 /*     */ 
	 /*     */   public void close()
	 /*     */   {
	 /*  84 */     closeResultSet();
	 /*     */ 
	 /*  86 */     closePreparedStatement();
	 /*     */ 
	 /*  88 */     closeConnection();
	 /*     */   }
	 /*     */ 
	 /*     */   private void closeConnection() {
	 /*  92 */     if (CONNECTION.get() == null)
	 /*  93 */       return;
	 /*     */     try
	 /*     */     {
	 /*  96 */       if (!((Connection)CONNECTION.get()).isClosed())
	 /*  97 */         ((Connection)CONNECTION.get()).close();
	 /*     */     } catch (SQLException e) {
	 /*  99 */      System.out.println("无法关闭SQL Connection！");
	 /*     */     }
	 /*     */ 
	 /* 102 */     CONNECTION.remove();
	 /*     */   }
	 /*     */ 
	 /*     */   private void closePreparedStatement() {
	 /* 106 */     if (PREPARED_STATEMENT.get() == null)
	 /* 107 */       return;
	 /*     */     try
	 /*     */     {
	 /* 110 */       if (((Collection)PREPARED_STATEMENT.get())!=null)
	 /* 111 */         for (PreparedStatement pstmt :PREPARED_STATEMENT.get())
	 /* 112 */           if ((pstmt != null) && (!pstmt.isClosed()))
	 /* 113 */             pstmt.close();
	 /*     */     } catch (SQLException e) {
	 /* 115 */       System.out.println ( "无法关闭SQL PreparedStatement！");
	 /*     */     }
	 /* 117 */     ((Set)PREPARED_STATEMENT.get()).clear();
	 /*     */ 
	 /* 119 */     PREPARED_STATEMENT.remove();
	 /*     */   }
	 /*     */ 
	 /*     */   private void closeResultSet() {
	 /* 123 */     if (RESULT_SET.get() == null)
	 /* 124 */       return;
	 /*     */     try
	 /*     */     {
	 /* 127 */       if (((Collection)RESULT_SET.get())!=null)
	 /* 128 */         for (ResultSet rs : RESULT_SET.get())
	 /* 129 */           if ((rs != null) && (!rs.isClosed()))
	 /* 130 */             rs.close();
	 /*     */     } catch (SQLException e) {
	 /* 132 */       System.out.println( "无法关闭SQL ResultSet！");
	 /*     */     }
	 /* 134 */     ((Set)RESULT_SET.get()).clear();
	 /*     */ 
	 /* 136 */     RESULT_SET.remove();
	 /*     */   }
}
