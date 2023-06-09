package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.TestCase;

@RestController
@RequestMapping("/api")
public class RemainderController {
  
  @GetMapping("/findMaximumK")
  public int findMaximumK(@RequestParam int x, @RequestParam int y, @RequestParam int n) {
      int k = n;

      while (k % x != y) {
          k -= 1;
      }

      return k;
  }

  @PostMapping("/findMaximumK")
  public int findMaximumK(@RequestBody TestCase testCase) {
      int x = testCase.getX();
      int y = testCase.getY();
      int n = testCase.getN();

      int k = n;

      while (k % x != y) {
          k -= 1;
      }

      return k;
  }

}
