package com.fitness.Runners.run;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping("")
    String Home() {
        return "Runners App";
    }

//    @GetMapping("/getall")
//    List<Run> findAll() {
//        return runRepository.findAll();
//    }
//
//    @GetMapping("/getbyid/{id}")
//    Run findById(@PathVariable Integer id) {
//
//        Optional<Run> run = runRepository.findById(id);
//        if (run.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
//
//        return run.get();
//    }
//
//    @PostMapping("/create")
//    void createRun(@Valid @RequestBody Run run) {
//        runRepository.addRun(run);
//    }
//
//    @PutMapping("/update/{id}")
//    void updateRun(@Valid @RequestBody Run run, @PathVariable Integer id) {
//        runRepository.update(run, id);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    void delete(@PathVariable Integer id){
//        runRepository.delete(id);
//    }
}
