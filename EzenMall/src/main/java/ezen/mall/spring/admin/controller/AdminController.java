package ezen.mall.spring.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ezen.mall.spring.admin.service.AdminService;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/AdminSelect", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", adminService.adminSelectAll());
		logger.info("list", model);
		System.out.println("1111111" + model);
		return "./admin/admin_select_all_view";
	}
}
