package com.example.azurewebservicetest.services;


import com.example.azurewebservicetest.models.Hey;
import com.example.azurewebservicetest.repositories.HeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeyService {

    @Autowired
    private HeyRepository heyRepository;

    public List<Hey> getAllHeys() {
        return heyRepository.getAllHeys();
    }

    public void createHey(String hey) {
        heyRepository.createHey(hey);
    }
}
