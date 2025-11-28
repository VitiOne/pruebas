package com.clases.victor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  ServiceDataBase serviceDataBase;

  @GetMapping("/personas")
  public ResponseEntity<String> getPerson(
      @RequestParam("nombre") String nombre,
      @RequestParam("apellido") String apellido){
    serviceDataBase.connect();
    return ResponseEntity.ok("Has llamado a POST persona " + nombre +" "+apellido );
  }

  @PostMapping("/personas")
  public ResponseEntity<String> postPersonas(@RequestBody String body){
    serviceDataBase.connect();
    return ResponseEntity.ok("Has llamado a POST persona "+ body);
  }

}
