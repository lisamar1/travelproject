package com.lmig.gfc.travel_site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


@RequestMapping("/")
public String travelPage() {
	return "travel";
}


}	
	