package ezen.mall.spring.servicecenter.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class ServiceCenterDTO {
	
	private int board_number;
	private String member_id;
	private String board_content;
	private String board_title;
	private String board_date;
	private String board_image;
	
}
