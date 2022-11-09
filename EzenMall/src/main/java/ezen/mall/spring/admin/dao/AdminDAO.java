package ezen.mall.spring.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ezen.mall.spring.admin.dto.AdminMemberDTO;
import ezen.mall.spring.admin.dto.AdminProductDTO;;

@Repository
public class AdminDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<AdminMemberDTO> memberSelectAll(){
		return sqlSessionTemplate.selectList("memberSelectAll");
	}
	
	public AdminMemberDTO memberSelectDetail(String member_id) {
		return sqlSessionTemplate.selectOne("memberSelectDetail", member_id);
	}
	
	public List<AdminProductDTO> productSelectAll(){
		return sqlSessionTemplate.selectList("productSelectAll");
	}
	
	
}
