package com.spring3.zoo.impl;

import com.spring3.zoo.Animal;
import com.spring3.zoo.AnimalAsyncService;
import com.spring3.zoo.food.Food;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AnimalAsyncServiceImpl implements AnimalAsyncService {
    @Async
    @Override
    public void feed(Animal animal, Food food) {

    }
}
