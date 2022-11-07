package ezen.mall.spring.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ezen.mall.spring.admin.dao.AdminDAO;
import ezen.mall.spring.admin.dto.AdminMemberDTO;
import ezen.mall.spring.admin.dto.AdminProductDTO;

@Service
public class AdminService {
	@Autowired
	private AdminDAO adminDAO;
	
	public List<AdminMemberDTO> adminMemberSelectAll(){
		return adminDAO.memberSelectAll();
	}
	
	public AdminMemberDTO adminMemberSelectDetail(String member_id) {
		return adminDAO.memberSelectDetail(member_id);
	}
	
	public List<AdminProductDTO> adminProductSelectAll(){
		return adminDAO.productSelectAll();
	}
}
