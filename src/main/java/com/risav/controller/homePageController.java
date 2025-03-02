package com.risav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class homePageController {
  
  @GetMapping("/")
  @ResponseBody
  public String defaultPage() {
      return "Hello World !";
  }
  
}
