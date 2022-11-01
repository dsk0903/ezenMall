package ezen.mall.spring.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ezen.mall.spring.admin.dto.AdminDTO;;

@Repository
public class AdminDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<AdminDTO> memberSelectAll(){
		return sqlSessionTemplate.selectList("memberSelectAll");
	}
	
	public List<AdminDTO> productSelectAll(){
		return sqlSessionTemplate.selectList("productSelectAll");
	}
	
	
}
