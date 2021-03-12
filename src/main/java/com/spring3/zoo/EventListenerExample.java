package com.spring3.zoo;

import com.spring3.zoo.event.AnimalIsHungryEvent;
import com.spring3.zoo.impl.Cat;
import com.spring3.zoo.impl.Dog;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerExample {
    @EventListener
    public void catIsHungryEventListener(AnimalIsHungryEvent<Cat> catAnimalIsHungryEvent) {
        System.out.println("cat event caught");
    }

    @EventListener
    public void dogIsHungryEventListener(AnimalIsHungryEvent<Dog> dogAnimalIsHungryEvent) {
        System.out.println("dog event caught");
    }

    @EventListener
    public void anyAnimalIsHungryEventListener(AnimalIsHungryEvent anyAnimalIsHungryEvent) {
        System.out.println("any event caught");
    }
}
