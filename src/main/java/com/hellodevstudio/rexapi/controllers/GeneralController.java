package com.hellodevstudio.rexapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class GeneralController {

  @GetMapping(value = "health-check")
  public String getHealthCheck(){
    return "Process ok!";
  }

}
