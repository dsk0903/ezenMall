package ezen.mall.spring.admin.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
public class AdminProductDTO {
	private int product_number;
	private String category_code;
	private String product_name;
	private int product_price;
	private int product_stock;
	private String product_desc;
	private String product_date;
	private int product_hits;
}
