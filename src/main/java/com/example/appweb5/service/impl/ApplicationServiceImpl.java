package com.example.appweb5.service.impl;

import com.example.appweb5.DTO.GameDTO;
import com.example.appweb5.DTO.UserDTO;
import com.example.appweb5.service.ApplicationService;
import com.example.appweb5.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Override
    public String firstService() {
        return "Bienvenido";
    }

    @Override
    public UserDTO saveUser() throws IOException {
        UserDTO userDTO =new UserDTO();
        userDTO.setNombre_usuario("Cesar");
        userDTO.setEmail_usuario("cesar@hotmail.com");
        userDTO.setPassword_usuario("1234");
        userDTO.setTipo_usuario(1);
        return userDTO;
    }

    @Override
    public GameDTO getGames() throws IOException{

        return null;
    }
}
