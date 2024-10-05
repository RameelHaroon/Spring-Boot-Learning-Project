package com.fitness.Runners.run;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Integer miles,
        Location location
        ) {}
