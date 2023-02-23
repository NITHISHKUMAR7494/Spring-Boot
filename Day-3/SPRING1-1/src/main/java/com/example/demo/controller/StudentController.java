package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.service.StudentService;

@RestController

public class StudentController {

@Autowired
private StudentService stuservice;


@PostMapping("/addStudent")
public String postDetails (@RequestBody student s)

{

return stuservice.addDetails(s);



}

@GetMapping ("/getStudent")

public List<student>getDetails()

{

return stuservice.getAllDetails();

}
}