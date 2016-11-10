package com.hhit.service;

import java.util.List;

import com.hhit.entity.PageBean;
import com.hhit.entity.UserModel;

public interface IUserService
{
//	public PageBean getUserList(int page);

	public void addUser(UserModel user);

	public void editUser(UserModel user);

	public void deleteUserById(int id);

	public UserModel getUserById(int id);

	public UserModel checkUserEmail(UserModel user);

	public UserModel queryByName(UserModel user);

}
