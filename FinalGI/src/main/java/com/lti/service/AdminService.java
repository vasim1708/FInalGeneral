package com.lti.service;

import com.lti.beans.Admin;

public interface AdminService {

	Admin findAdminByUserName(String adminUserName);

	String addAdmin(Admin admin);

}
