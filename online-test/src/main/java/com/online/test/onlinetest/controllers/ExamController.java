package com.online.test.onlinetest.controllers;

import com.online.test.onlinetest.dto.ExamDTO;
import com.online.test.onlinetest.dto.NewExamDTO;
import com.online.test.onlinetest.dto.services.ExamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//para la ruta del controlador
@RequestMapping("/exams")

public class ExamController {
    private final ExamService service;

    @Autowired
    ExamController(ExamService srv){
        this.service = srv;
    }


    @PostMapping()
    public ResponseEntity<?> create(@RequestBody NewExamDTO examDTO){
        try {
            ExamDTO result = service.create(examDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }


    @GetMapping("/(id)")
    public ResponseEntity<?> retrieve(@PathVariable("id") Long id){
        try {
            ExamDTO result = service.retrieve(id);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }
}