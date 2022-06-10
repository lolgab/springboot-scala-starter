package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation._

@SpringBootApplication
@RestController
class HelloApplication {
  @GetMapping(Array("/hello"))
  def hello: String = "Hello world!"
}

object Main extends App {
  SpringApplication.run(classOf[HelloApplication], args: _*)
}
