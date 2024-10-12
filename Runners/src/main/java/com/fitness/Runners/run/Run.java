package com.fitness.Runners.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startTime,
        LocalDateTime endTime,
        @Positive @NotEmpty
        Integer miles,
        Location location
        ) {

        public Run{
                if(!endTime.isAfter(startTime)){
                        throw new IllegalArgumentException("end time should be after start time");
                }
        }
}
