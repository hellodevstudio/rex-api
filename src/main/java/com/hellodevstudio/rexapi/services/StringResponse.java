package com.hellodevstudio.rexapi.services;

import lombok.Data;

@Data
public class StringResponse {
   String result;
   
   public StringResponse(String result) {
      this.result = result;
   }
}
