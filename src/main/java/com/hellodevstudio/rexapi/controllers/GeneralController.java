package com.hellodevstudio.rexapi.controllers;

import com.hellodevstudio.rexapi.services.StringResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class GeneralController {

  @GetMapping(value = "health-check")
  @ResponseBody
  public StringResponse getHealthCheck(){
    return new StringResponse("Process Ok!");
  }

}
