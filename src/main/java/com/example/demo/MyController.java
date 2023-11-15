package com.example.demo;

import com.example.demo.qualifiedbean.UsingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyController {
    private final MyEntityRepository myEntityRepository;
    private final UsingService usingService;

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok(usingService.getDescription());
    }

    @GetMapping("/action")
    public ResponseEntity action(@RequestParam(required = false) boolean force) {
        MyEntity entity = new MyEntity();
        entity.setDescription("TEST description");
        entity.setValue(0.011);
        myEntityRepository.save(entity);
        return ResponseEntity.ok("good");
    }

    @GetMapping("/action/{id}")
    public ResponseEntity action(@PathVariable Integer id) {
        return ResponseEntity.ok(myEntityRepository.findAllById(id));
    }
}
