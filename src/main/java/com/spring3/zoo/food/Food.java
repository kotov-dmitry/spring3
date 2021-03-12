package com.spring3.zoo.food;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Food {
    private LocalDateTime expiredDate;
    private FoodType foodType;
    private BigDecimal value;
}
