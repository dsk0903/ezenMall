package ezen.mall.spring.admin.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
public class AdminMemberDTO {
	private String member_id;
	private String member_pwd;
	private String member_name;
	private String member_email;
	private String member_nickname;
	private String member_profile;
	private String member_check;
	private int member_role;
	private String member_grade;
	private String member_phone;
	private String member_date;
}
