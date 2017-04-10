package com.jenkins.example;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by maty on 9/4/17.
 */
@Controller
@RequestMapping("/example")
public class ExampleController {



  @RequestMapping(value ="/{id}", method = RequestMethod.GET)
  public ResponseEntity<String> get(@PathVariable String id){


    return ResponseEntity.ok(id);

  }
}
