package ezen.mall.spring.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ezen.mall.spring.admin.dao.AdminDAO;
import ezen.mall.spring.admin.dto.AdminDTO;

@Service
public class AdminService {
	@Autowired
	private AdminDAO adminDAO;
	
	public List<AdminDTO> adminSelectAll(){
		return adminDAO.selectAll();
	}
}
