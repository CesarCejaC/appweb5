package com.example.appweb5.controller;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.ReviewDTO;
import com.example.appweb5.DTO.UserDTO;
import com.example.appweb5.exception.BusinessException;
import com.example.appweb5.model.Game;
import com.example.appweb5.model.Review;
import com.example.appweb5.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

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

    //crear reseña desde json
    @RequestMapping(value = "/newReview", method = RequestMethod.POST)
    public ResponseEntity<Review> newReview(@RequestBody Review review){
        Review review1 = applicationService.newReview(review);
        return new ResponseEntity(review1, HttpStatus.CREATED);
    }

    //get reviews
    @GetMapping("/getReviews")
    public ResponseEntity<Review> listReviews() {
        List<Review> reviews = applicationService.listReviews();
        return new ResponseEntity(reviews, HttpStatus.OK);
    }

    //get games
    @GetMapping("/getGames")
    public ResponseEntity<Game> listGames() {
        List<Game> games = applicationService.listGames();
        return new ResponseEntity(games, HttpStatus.OK);
    }

}
