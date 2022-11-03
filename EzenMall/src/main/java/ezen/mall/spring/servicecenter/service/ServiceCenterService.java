package ezen.mall.spring.servicecenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ezen.mall.spring.servicecenter.dao.ServiceCenterDAO;
import ezen.mall.spring.servicecenter.dto.ServiceCenterDTO;

@Service
public class ServiceCenterService {
	
	@Autowired
	private ServiceCenterDAO serviceCenterDAO;
	
	public List<ServiceCenterDTO> serviceSelectAll() {
		return serviceCenterDAO.serviceSelectAll();
	}
	
}
