package com.spring3.zoo;

import com.spring3.zoo.event.AnimalIsHungryEvent;
import com.spring3.zoo.impl.Cat;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CatEventListener implements ApplicationListener<AnimalIsHungryEvent<Cat>> {
    @Override
    public void onApplicationEvent(AnimalIsHungryEvent<Cat> event) {
        System.out.println("cat event caught");
    }
}
