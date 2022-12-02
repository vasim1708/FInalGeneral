package com.lti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.service.AdminService;



@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	//http://localhost:8282/admin/shru@100
	@GetMapping("/{adminUserName}")
	public Admin findAdminByUserName(@PathVariable("adminUserName") String adminUserName) {
		Admin admin= adminService.findAdminByUserName(adminUserName);
		return admin;
	}
	
	
	//http://localhost:8282/admin/
	@PostMapping("/")
	public String addAdmin(@RequestBody Admin admin) {
		String adminUserName=adminService.addAdmin(admin);
		return adminUserName;
	}

		
}