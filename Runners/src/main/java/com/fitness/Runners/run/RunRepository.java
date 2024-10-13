package com.fitness.Runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class RunRepository {

    private final JdbcClient jdbcClient;

    public RunRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

}
