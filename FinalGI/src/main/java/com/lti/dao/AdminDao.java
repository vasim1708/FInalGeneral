package com.lti.dao;
import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;
@Repository
public interface AdminDao {
	public Admin findAdminByUserName(String adminUserName);
	public String addAdmin(Admin admin);

}
