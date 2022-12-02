package com.lti.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
import com.lti.dao.AdminDao;



@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao admindao;
	
	@Override
	public Admin findAdminByUserName(String adminUserName) {
		Admin admin= admindao.findAdminByUserName(adminUserName);
		return admin;
	}

	@Override
	public String addAdmin(Admin admin) {
		String adminUserName=admindao.addAdmin(admin);
		return adminUserName;
	}

}