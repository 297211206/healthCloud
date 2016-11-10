package com.hhit.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import com.hhit.entity.UserModel;

public class Validator
{
	         private static final String EMAIL = "^(?:\\w+\\.?-?)*\\w+@(?:\\w+\\.?-?)*\\w+$";
	 /*    */ 
	 /*    */   public boolean isBlank(String string)
	 /*    */   {
	 /* 23 */     return (string == null) || (string.trim().length() == 0);
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean isEmpty(Object[] array)
	 /*    */   {
	 /* 28 */     return (array == null) || (array.length == 0);
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean isEmpty(Collection<?> collection)
	 /*    */   {
	 /* 33 */     return (collection == null) || (collection.isEmpty());
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean isEmpty(Map<?, ?> map)
	 /*    */   {
	 /* 38 */     return (map == null) || (map.isEmpty());
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean isEmail(String email)
	 /*    */   {
	 /* 43 */     return isBlank(email) ? false : isMatchPattern(email, "^(?:\\w+\\.?-?)*\\w+@(?:\\w+\\.?-?)*\\w+$");
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean isMatchPattern(String string, String pattern)
	 /*    */   {
	 /* 48 */     return Pattern.compile(pattern).matcher(string).find();
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean isPersistence(UserModel user)
	 /*    */   {
	 /* 53 */     return (user != null) && (!isBlank(user.getName()));
	 /*    */   }
	 /*    */ 
	 /*    */   public boolean contains(Object obj1, Object obj2)
	 /*    */   {
	 /* 58 */     if ((obj1 == null) || (obj2 == null)) {
	 /* 59 */       return false;
	 /*    */     }
	 /*    */ 
	 /* 62 */     if (((obj1 instanceof Map)) && 
	 /* 63 */       (((Map)obj1).containsKey(obj2))) {
	 /* 64 */       return true;
	 /*    */     }
	 /*    */ 
	 /* 67 */     if ((obj1 instanceof Iterable)) {
	 /* 68 */       Iterator iter = ((Iterable)obj1).iterator();
	 /* 69 */       while (iter.hasNext()) {
	 /* 70 */         Object value = iter.next().toString().trim();
	 /* 71 */         if ((obj2.equals(value)) || (obj2.toString().trim().equals(value)))
	 /* 72 */           return true;
	 /*    */       }
	 /*    */     }
	 /* 75 */     else if (obj1.getClass().isArray()) {
	 /* 76 */       for (int i = 0; i < Array.getLength(obj1); i++) {
	 /* 77 */         Object value = null;
	 /* 78 */         value = Array.get(obj1, i);
	 /*    */ 
	 /* 80 */         if (obj2.equals(value))
	 /* 81 */           return true;
	 /*    */       }
	 /*    */     } else {
	 /* 84 */       if (obj1.toString().equals(obj2.toString()))
	 /* 85 */         return true;
	 /* 86 */       if (obj1.equals(obj2)) {
	 /* 87 */         return true;
	 /*    */       }
	 /*    */     }
	 /* 90 */     return false;
	 /*    */   }
}
