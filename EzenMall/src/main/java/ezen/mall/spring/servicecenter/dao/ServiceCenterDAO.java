package ezen.mall.spring.servicecenter.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import ezen.mall.spring.servicecenter.dto.ServiceCenterDTO;

@Repository
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ServiceCenterDAO {
	
	@Autowired
	SqlSessionTemplate sessionTemplate;
	
	public List<ServiceCenterDTO> serviceSelectAll() {
		return sessionTemplate.selectList("serviceSelectAll");
	}
	
}
