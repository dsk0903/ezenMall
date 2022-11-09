package ezen.mall.spring.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ezen.mall.spring.product.dto.ProductDTO;
import ezen.mall.spring.product.service.ProductService;

@Controller
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/ProductSelect", method = RequestMethod.GET)
	public String productList(Model modell) {
		modell.addAttribute("list", productService.ProductSelectAll());
		logger.info("list", modell);
		System.out.println("12341234" + modell);
		return "./product/c";
	}
	
	@RequestMapping(value = "/ProductSelectDetail", method = RequestMethod.GET)
	public String detail(Model model, ProductDTO productDTO) {
		model.addAttribute("productDTO", productService.ProductSelect(productDTO.getProduct_number()));
		
		return "./product/shop_detail_view";
	}
	
	
}
