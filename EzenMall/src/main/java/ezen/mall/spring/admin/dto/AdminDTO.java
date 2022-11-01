package ezen.mall.spring.admin.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
public class AdminDTO {
	private String member_id;
	private String member_pwd;
	private String member_name;
	
	private int product_number;
	private String product_name;
	private int product_price;
}
