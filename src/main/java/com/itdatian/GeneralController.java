package com.itdatian;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/generalController")
public class GeneralController {

	@RequestMapping(value="index")
	public String index_jsp(Model model){
		String temp = "測試";
		if(StringUtils.isNotBlank(temp)){
			System.out.println(temp);
		}
		
		model.addAttribute("liming", "黎明你好");
		return "index";
	}
}
