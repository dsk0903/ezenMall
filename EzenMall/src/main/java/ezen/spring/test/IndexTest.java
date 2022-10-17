package ezen.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;


@Controller
public class IndexTest {
	private static final Logger logger = LoggerFactory.getLogger(IndexTest.class);
	
	public String test() {
		return "";
	}
}
