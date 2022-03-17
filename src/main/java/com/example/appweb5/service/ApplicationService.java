package com.example.appweb5.service;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.UserDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();

    UserDTO saveUser() throws IOException;

    GameDTO getGames() throws IOException;
}
