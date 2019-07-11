package model.dao;

import dbb.DB;
import model.dao.impl.DepartmentDaoJDBC;

public class DaoFactory {

	public static DepartmentDaoJDBC createDepartmentDao() {
		
		return new DepartmentDaoJDBC(DB.getConnection());
		
	}
}
