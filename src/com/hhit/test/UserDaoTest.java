package com.hhit.test;

import com.hhit.dao.IUserDao;

public class UserDaoTest
{
	private IUserDao userimpl;

	public void setUserimpl(IUserDao userimpl)
	{
		this.userimpl = userimpl;
	}
	public IUserDao getUserimpl()
	{
		return userimpl;
	}
	
}
