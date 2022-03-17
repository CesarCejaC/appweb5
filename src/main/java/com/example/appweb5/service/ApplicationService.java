package com.example.appweb5.service;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.ReviewDTO;
import com.example.appweb5.DTO.UserDTO;
import com.example.appweb5.model.Game;
import com.example.appweb5.model.Review;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface ApplicationService {

    String firstService();

    //guardar reseña desde json
    Review newReview(Review review);

    //obtener reseñas
    List<Review> listReviews();

    //Obtener games
    List<Game> listGames();
}
