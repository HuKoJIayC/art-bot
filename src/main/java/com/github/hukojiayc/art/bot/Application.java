package com.github.hukojiayc.art.bot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication
//@ComponentScan(basePackages = "com.github.hukojiayc.telegram.bot")
public class Application {

  @SneakyThrows
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    log.info(":::::::::::::::::::::::::::::::::::::::::::");
  }
}
