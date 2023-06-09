package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.example.demo.resource.RemainderController;

@SpringBootTest
public class RemainderControllerTest {
  
  private MockMvc mockMvc;

  @Test
  void testFindMaximumKWithGetRequest() throws Exception {
      mockMvc = MockMvcBuilders.standaloneSetup(new RemainderController()).build();

      mockMvc.perform(MockMvcRequestBuilders.get("/api/findMaximumK")
              .param("x", "7")
              .param("y", "5")
              .param("n", "12345"))
              .andExpect(MockMvcResultMatchers.status().isOk())
              .andExpect(MockMvcResultMatchers.content().string("12339"));
  }

  @Test
  void testFindMaximumKWithPostRequest() throws Exception {
      mockMvc = MockMvcBuilders.standaloneSetup(new RemainderController()).build();

      String requestBody = "{\"x\": 7, \"y\": 5, \"n\": 12345}";

      mockMvc.perform(MockMvcRequestBuilders.post("/api/findMaximumK")
              .contentType(MediaType.APPLICATION_JSON)
              .content(requestBody))
              .andExpect(MockMvcResultMatchers.status().isOk())
              .andExpect(MockMvcResultMatchers.content().string("12339"));
  }

}
