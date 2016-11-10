package com.hhit.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;


public class SecurityMD5
{
	private static final byte[] BLANK = "".getBytes();
	/*    */   private static final String MD5 = "MD5";
	/* 20 */   private static final char[] HEX = "0123456789abcdef".toCharArray();

	/*    */   private Logger logger = Logger.getLogger("lavasoft");
	/*    */   
	/*    */   public String md5(String text)
	/*    */   {
	/*    */     try {
	/* 30 */       return string(MessageDigest.getInstance("MD5").digest(text == null ? BLANK : text.getBytes()));
	/*    */     }
	/*    */     catch (NoSuchAlgorithmException ex)
	/*    */     {
	/* 34 */       this.logger.warning("Security.class "+ ex);
	/*    */     }
	/* 36 */     return null;
	/*    */   }
	/*    */ 
	/*    */   private String string(byte[] code)
	/*    */   {
	/* 42 */     StringBuffer string = new StringBuffer();
	/*    */ 
	/* 44 */     for (byte by : code) {
	/* 45 */       string.append(HEX[(0xF & by >> 4)]).append(HEX[(0xF & by)]);
	/*    */     }
	/* 47 */     return string.toString();
	/*    */   }
	/*    */ 
	/*    */   public static void main(String[] args) {
	/* 51 */     SecurityMD5 sc = new SecurityMD5();
	/* 52 */     String ps = sc.md5("931230yf");
	/* 53 */     System.out.println("加密后的密文为： " + ps);
	/*    */   }
}
