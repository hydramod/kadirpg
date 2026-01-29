package com.example.helloinfra;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppInfoController {

  @GetMapping("/")
  public Map<String, String> appInfo() {
    return Map.of(
        "app", "hello-infra",
        "version", "1.0",
        "env", "dev"
    );
  }
}
