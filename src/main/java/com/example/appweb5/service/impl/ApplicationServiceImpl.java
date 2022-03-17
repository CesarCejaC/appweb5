package com.example.appweb5.service.impl;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.ReviewDTO;
import com.example.appweb5.DTO.UserDTO;
import com.example.appweb5.model.Game;
import com.example.appweb5.model.Review;
import com.example.appweb5.repository.GameRepository;
import com.example.appweb5.repository.ReviewRepository;
import com.example.appweb5.service.ApplicationService;
import com.example.appweb5.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    GameRepository gameRepository;

    @Override
    public String firstService() {
        return "Bienvenido";
    }

    //guardar reseña desde json
    @Override
    public Review newReview(Review review){
        return reviewRepository.save(review);
    }

    //get reseñas
    @Override
    public List<Review> listReviews() {
        Iterable<Review> rev = reviewRepository.findAll();
        List<Review> list = new ArrayList<Review>();
        rev.forEach(list::add);
        return list;
    }

    //get games
    @Override
    public List<Game> listGames() {
        Iterable<Game> juego = gameRepository.findAll();
        List<Game> list = new ArrayList<Game>();
        juego.forEach(list::add);
        return list;
    }
}
