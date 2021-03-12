package com.spring3.zoo.impl;

import com.spring3.aspect.annotationMarker.Marker;
import com.spring3.zoo.Animal;
import com.spring3.zoo.AnimalService;
import com.spring3.zoo.food.Food;
import org.springframework.stereotype.Service;

@Service
@Marker
public class AnimalServiceImpl implements AnimalService {

    @Override
    public void feedAnimal(Food food, Animal animal) {
        animal.feed(food);
    }
}
