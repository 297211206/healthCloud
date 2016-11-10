package com.hhit.base.sql;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Sql {
	 public abstract ResultSet query(String paramString, Object[] paramArrayOfObject)
	    throws SQLException;

	  public abstract void update(String paramString, Object[] paramArrayOfObject)
	    throws SQLException;

	  public abstract void close();
}
