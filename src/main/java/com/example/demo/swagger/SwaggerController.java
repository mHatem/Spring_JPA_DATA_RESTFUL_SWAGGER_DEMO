package com.example.demo.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SwaggerController {

	@RequestMapping(value = "")
	public String info() {
		return "<h2>Spring_JPA_DATA_RESTFUL_SWAGGER_DEMO</h2>"
				+ "<br/> Swagger APIs : <a href=\"swagger-ui.html\">/swagger</a>"
				+ "<br/> More info: <a href=\"https://www.githun.com/mhatem\">/info</a>";
	}
}
