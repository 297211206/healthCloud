package com.hhit.dao;


import com.hhit.entity.UserModel;

public interface IUserDao
{

	public UserModel getUserById(int id);

	public void addUser(UserModel user);

	public void updateUser(UserModel user);

	public void deleteUserById(int id);
}
