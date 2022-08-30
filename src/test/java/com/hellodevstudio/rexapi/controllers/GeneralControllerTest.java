package com.hellodevstudio.rexapi.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
public class GeneralControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void test_ok_status() throws Exception {
    this.mockMvc.perform(get("/api/health-check")).andExpect(status().isOk());
  }

  @Test
  public void test_bad_request() throws Exception {
    this.mockMvc.perform(get("/api/health-checks")).andExpect(status().is4xxClientError());
  }

  @Test
  public void test_result_health_check_response() throws Exception {
    String expectedResult = "Process Ok!";
    this.mockMvc.perform(get("/api/health-check"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expectedResult));

  }

}
