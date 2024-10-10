package com.fitness.Runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import java.util.stream;


@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs.stream()
            .filter(run -> run.id() == id)
            .findFirst();
            //.get()
            //.orElse(null);
    }

    void addRun(Run run){
        runs.add(run);
    }

    void update(Run run, Integer id){
        Optional<Run> existingObj = findById(id);
        if(existingObj.isPresent()){
            runs.set(runs.indexOf(existingObj.get()), run);
        }
    }

    void delete(Integer id){
        runs.removeIf(run -> run.id().equals(id));
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1,
                "Monday Morning Jog",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.INDOOR
        ));

        runs.add(new Run(2,
                "Tuesday Morning Jog",
                LocalDateTime.now(),
                LocalDateTime.now().plus(40, ChronoUnit.MINUTES),
                3,
                Location.INDOOR
        ));
    }

}
