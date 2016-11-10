package com.hhit.service;

import java.sql.ResultSet;
import java.util.List;

import com.hhit.entity.LoveProjectModel;

public interface LvProjectService {

	 public abstract void save(LoveProjectModel loveProject );

		public abstract void update(LoveProjectModel loveProject );
		public abstract ResultSet queryProjectByStatement();
		public List<LoveProjectModel> queryByProjectStatement(String lvProjectStatement); 
}
