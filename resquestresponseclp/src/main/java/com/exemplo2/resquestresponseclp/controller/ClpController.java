package com.exemplo2.resquestresponseclp.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo2.resquestresponseclp.dto.ClpDataDTO;

@RestController
@RequestMapping("/api/clp")
@CrossOrigin(origins = "*")

public class ClpController {
    private final Random random = new Random();
    @GetMapping("/ler-bloco")
    public  ClpDataDTO lerDadosClp(){
        int[] buffer = new int[28];
        for (int i = 0; i < buffer.length; i++){
            buffer[i] = random.nextInt(4);
        }

            String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:SSS"));

            return  new ClpDataDTO(9,68,buffer,"OK-Conectado", hora);
        }
    }
    
