package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.StudentRepo;
@Service

public class StudentService {

@Autowired

private StudentRepo stu;
public String addDetails(student s)

{

 stu.save(s);
 return "saved";


}

public List<student>getAllDetails()

{

return stu.findAll();

}

public void deleteDepartmentByRollnum(int rollnum)

{

stu.deleteById(rollnum);

}

}