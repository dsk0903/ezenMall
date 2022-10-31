package ezen.mall.spring.product.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ezen.mall.spring.product.dto.ProductDTO;

@Repository

public class ProductDAO {
	@Autowired
	SqlSessionTemplate sqlsessionTemplate;
}
