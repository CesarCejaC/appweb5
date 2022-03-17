package com.example.appweb5.service.impl;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.ReviewDTO;
import com.example.appweb5.DTO.UserDTO;
import com.example.appweb5.model.Review;
import com.example.appweb5.repository.ReviewRepository;
import com.example.appweb5.service.ApplicationService;
import com.example.appweb5.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public String firstService() {
        return "Bienvenido";
    }
///guardar reseña
    @Override
    public Review newReview(Review review){
        return reviewRepository.save(review);
    }

}
