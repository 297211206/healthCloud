package com.hhit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.hhit.base.sql.SqlImpl;

public class LovePaymentDao extends SqlImpl{

	
	/**
	 *个人 捐款总金额
	 * @param ids
	 * @return
	 * @throws SQLException 
	 */
	public int queryMoneyByIds(String ids) throws SQLException{
		String[] id = ids.split(",");
		String str = "";
		for(int i = 0;i< id.length;i++){
			if(i == id.length-1){
				str += "'"+id[i]+"'";
			}else{
				str += "'"+id[i]+"'"+",";
			}
			
		}
		
		String sql = "SELECT c_money FROM t_love_payment WHERE c_id in("+str+")";
		ResultSet set = query(sql, null);
		int allsum = 0;
		try {
			if(set.next()){
				allsum = set.getInt(1);
				allsum += allsum;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allsum;
	}
}
