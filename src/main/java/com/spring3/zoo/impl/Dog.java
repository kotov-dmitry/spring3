package com.spring3.zoo.impl;

import com.spring3.zoo.Animal;
import com.spring3.zoo.food.Food;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Dog implements Animal {

    private Food food;
    private Integer age;

    @Override
    public void voice() {
        System.out.println("gav");
    }

    @Override
    public void feed(Food food) {
        this.food = food;
    }

    @Override
    public void throwException() {

    }
}
