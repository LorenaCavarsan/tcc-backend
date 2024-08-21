package smart.senaigame.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import smart.senaigame.entities.ProcessSeletivo;
import smart.senaigame.repository.ProcessRepository;

import java.util.List;

@Controller
@RequestMapping("/api/provas") // Mapeia o caminho base para este controlador

public class ProcessController {
    @Autowired
    ProcessRepository repository;

    @GetMapping("/all")
    public ResponseEntity<List<ProcessSeletivo>> getAllProcess() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProcessSeletivo> getProcess(@PathVariable Integer id) {
        var processo = repository.findById(id);
        if (processo.isPresent()){
            return ResponseEntity.ok().body(repository.findById(id).get());
        }else {
            return ResponseEntity.noContent().build();
        }
    }
}