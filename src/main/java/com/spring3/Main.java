package com.spring3;

import com.spring3.configuration.AnnotationConfiguration;
import com.spring3.configuration.BeanConfiguration;
import com.spring3.zoo.Animal;
import com.spring3.zoo.AnimalService;
import com.spring3.zoo.Zoo;
import com.spring3.zoo.food.Food;
import com.spring3.zoo.food.FoodType;
import com.spring3.zoo.impl.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = getAnnotationContext("annotationConfiguration");
        Zoo setterZoo = context.getBean("zoo", Zoo.class);
//        setterZoo.getAnimals().forEach(Animal::voice);
        setterZoo.getAnimal1().voice();
        setterZoo.getAnimal2().voice();
//        setterZoo.doAllAnimalsHungry();
//        context.publishEvent(new AnimalIsHungryEvent<Cat>(new Cat()));
        System.out.println(setterZoo);

        AnimalService animalService = context.getBean("animalServiceImpl", AnimalService.class);
        Animal cat = context.getBean("cat", Animal.class);
        animalService.feedAnimal(
                Food.builder()
                        .expiredDate(LocalDateTime.now().plusHours(3))
                        .foodType(FoodType.FISH)
                        .value(BigDecimal.valueOf(10)).build(),
                cat
        );
        cat.getAge();
        cat.throwException();
    }

    private static ApplicationContext getAnnotationContext(String profile) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles(profile);
        annotationConfigApplicationContext.register(AnnotationConfiguration.class, BeanConfiguration.class);
        annotationConfigApplicationContext.refresh();
        return annotationConfigApplicationContext;
    }

    private static ApplicationContext getXmlContext() {
        return new ClassPathXmlApplicationContext("XmlApplicationContext.xml");
    }
}
