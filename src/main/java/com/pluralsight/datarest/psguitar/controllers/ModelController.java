package com.pluralsight.datarest.psguitar.controllers;

import com.pluralsight.datarest.psguitar.model.Model;
import com.pluralsight.datarest.psguitar.repository.ModelRepository;
import org.dom4j.rule.Mode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/models")
public class ModelController {

    @Autowired
    private ModelRepository modelRepository;

    @GetMapping
    public List<Model> list(@RequestParam(required = false) String name) {
            return modelRepository.list();
    }

    @GetMapping("/{id}")
    public Model get(@PathVariable Long id) {
        return modelRepository.find(id);
    }

    @PostMapping
    public Model create(@RequestBody final Model model) {
        return modelRepository.create(model);
    }



    @DeleteMapping
    public void delete(@PathVariable Long id) {
        modelRepository.delete(id);
    }

    @PutMapping
    public Model update(@PathVariable Long id,@RequestBody Model model) {
        Model existModel = modelRepository.find(id);
        BeanUtils.copyProperties(model, existModel,"id");
        return modelRepository.update(model);
    }
}
