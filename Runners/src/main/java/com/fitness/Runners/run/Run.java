package com.fitness.Runners.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Integer miles,
        Location location
        ) {}
