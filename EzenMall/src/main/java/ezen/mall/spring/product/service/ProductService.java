package ezen.mall.spring.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ezen.mall.spring.product.dao.ProductDAO;
import ezen.mall.spring.product.dto.ProductDTO;

@Service

public class ProductService {
	@Autowired
	
	private ProductDAO productDAO;
	//0. 전체보기, 상세보기 / 개인사업자(입력, 관리자(수정, 삭제))
	
	
	//1. 전체보기
	public List<ProductDTO> ProductSelectAll(){
		return productDAO.productSelectAll();
	}
	
	//2. 상세보기
	public ProductDTO ProductSelect(int product_number) {
		return productDAO.productSelect(product_number);
	}
}
