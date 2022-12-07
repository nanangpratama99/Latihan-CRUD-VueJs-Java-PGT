package com.example.students.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.model.Students;
import com.example.students.repository.IStudentsRepository;
import com.example.students.service.IStudentsService;

@Service
public class StudentsService implements IStudentsService {

    @Autowired
    IStudentsRepository studentsRepository;

    // Insert Data Student
    @Override
    public Students insertStudents(Students students) {
        return studentsRepository.insertStudents(students);
    }

    // Get All Student
    @Override
    public List<Students> getAllStudents() {
        return studentsRepository.getAllStudents();
    }

    // Update Data Student
    @Override
    public Students updateStudents(int id, Students students) {
        return studentsRepository.updateStudents(id, students);
    }

    // Delete Data Student
    @Override
    public Students deleteStudents(int id) {
        return studentsRepository.deleteStudents(id);
    }

    // Get Data Student
    @Override
    public Students getStudent(int id) {
        return studentsRepository.getStudents(id);
    }
  
}
