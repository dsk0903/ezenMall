package ezen.mall.spring.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ezen.mall.spring.admin.dto.AdminMemberDTO;
import ezen.mall.spring.admin.service.AdminService;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService adminService;
	
	// main
	@RequestMapping(value = "/AdminMain", method = RequestMethod.GET)
	public String main() {
		return "/admin/admin_main_view";
	}
	
	// 사용자 전체 조회
	@RequestMapping(value = "/AdminMemberSelect", method = RequestMethod.GET)
	public String memberList(Model model) {
		model.addAttribute("list", adminService.adminMemberSelectAll());
		logger.info("list", model);
		System.out.println("" + model);
		return "./admin/admin_member_select_view";
	}
	
	// 사용자 상세 조회
	@RequestMapping(value = "/AdminMemberSelectDetail", method = RequestMethod.GET)
	public String memberDetail(Model model, AdminMemberDTO adminMemberDTO) {
		model.addAttribute("adminMemberDTO", adminService.adminMemberSelectDetail(adminMemberDTO.getMember_id()));
		logger.info("list", model);
		System.out.println("" + model);
		return "./admin/admin_member_select_detail_view";
	}
	
	// 상품 전체 조회
	@RequestMapping(value = "/AdminProductSelect", method = RequestMethod.GET)
	public String productList(Model modell) {
		modell.addAttribute("list", adminService.adminProductSelectAll());
		logger.info("list", modell);
		System.out.println("" + modell);
		return "./admin/admin_product_select_view";
	}
	

}
