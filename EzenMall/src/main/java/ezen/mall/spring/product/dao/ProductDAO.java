package ezen.mall.spring.product.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ezen.mall.spring.product.dto.ProductDTO;

@Repository

public class ProductDAO {
	@Autowired
	SqlSessionTemplate sqlsessionTemplate;
	
	public List <ProductDTO> productSelectAll() {
		return sqlsessionTemplate.selectList("productSelectAll");
	}
	
	public ProductDTO productSelect(int product_number) {
		return sqlsessionTemplate.selectOne("productSelect", product_number);
	}
	
}
