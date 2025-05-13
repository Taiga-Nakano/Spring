package jp.co.sss.shop.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContraller {
	@RequestMapping(path = "/")
	public String IndexController(){
		return "index";
	}
}
