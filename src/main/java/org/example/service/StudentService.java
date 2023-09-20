package org.example.service;

import org.example.entity.StudentVO;

import java.util.List;


public interface StudentService {

    StudentVO insertStudent(StudentVO studentVO);

    List<StudentVO> getStudents();

    StudentVO getStudentById(int id);

    StudentVO editStudent(StudentVO studentVO, int id);

    void deleteStudent(int id);

//    List<StudentVO> getStudentFirstName(String firstName);

    List<StudentVO> getStudentFirstNameAndLastName(String firstName, String name);

    List<StudentVO> findByFirstNameContaining(String firstName);

    List<StudentVO> getStudentsByFirstNameOrLastName(String firstName, String lastName);

    List<StudentVO> findById(int id);
//
//    List<StudentVO> findByClassesVO_ClassName(String classes);
//
//    List<StudentVO> getByClassName(String className);
}
