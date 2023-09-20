package org.example.service;

import org.example.entity.ClassesVO;
import org.example.entity.StudentVO;

import java.util.List;


public interface ClassService {

    List<ClassesVO> findByStudentVO_FirstName(String firstName);
}
