package ezen.mall.spring.servicecenter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ezen.mall.spring.servicecenter.dto.ServiceCenterDTO;
import ezen.mall.spring.servicecenter.service.ServiceCenterService;

@Controller
public class ServiceCenterController {
	
	@Autowired
	private ServiceCenterService serviceCenterService;
	
	// 고객센터
	@RequestMapping(value = "/Servicecenter", method = RequestMethod.GET)
	public String serviceCenter(Model model, ServiceCenterDTO serviceCenterDTO) {
		
		model.addAttribute("list", serviceCenterService.serviceSelectAll());
		
		
		return "./board_service/service_center";
	}
}
