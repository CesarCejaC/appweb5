package com.example.appweb5.controller;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.UserDTO;
import com.example.appweb5.exception.BusinessException;
import com.example.appweb5.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api/v1",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @ExceptionHandler({ BusinessException.class })
    @ResponseBody
    public ResponseEntity<String> userHandler(BusinessException ex) {
        return new ResponseEntity<String>(ex.getMessage(), ex.getHttpStatus());
    }

    //prueba
    @GetMapping("")
    public String inicio(){return applicationService.firstService();}

    @GetMapping("/saveuser")
    public UserDTO saveUSer() throws IOException{
        return applicationService.saveUser();

    }

    @GetMapping("/getGames")
    public GameDTO getGames() throws IOException{
        return applicationService.getGames();
    }

}
