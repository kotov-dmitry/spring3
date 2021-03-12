package com.spring3.zoo;

import com.spring3.zoo.food.Food;

public interface Animal {
    void voice();

    void feed(Food food);

    Integer getAge();

    void throwException();
}
