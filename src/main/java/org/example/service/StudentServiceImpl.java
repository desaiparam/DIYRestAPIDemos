package org.example.service;

import org.example.entity.StudentVO;
import org.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentVO insertStudent(StudentVO studentVO) {
        return studentRepository.save(studentVO);

    }

    @Override
    public List<StudentVO> getStudents() {
        //return (List<StudentVO>) studentRepository.findAll();
        return studentRepository.findAll();

    }

    @Override
    public StudentVO getStudentById(int id) {
        StudentVO studentVO = studentRepository.findOne(id);
        return studentVO;
    }

    @Override
    public StudentVO editStudent(StudentVO studentVO, int id) {
        StudentVO studentVO1 = studentRepository.findOne(id);
        studentVO1.setFirstName(studentVO.getFirstName());
        studentVO1.setLastName(studentVO.getLastName());
        studentRepository.save(studentVO1);
        return studentVO1;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.delete(id);
    }

//    @Override
//    public List<StudentVO> getStudentFirstName(String firstName) {
//        return studentRepository.findByFirstName(firstName);
//    }

    @Override
    public List<StudentVO> getStudentFirstNameAndLastName(String firstName, String name) {
        return studentRepository.findByFirstNameAndLastName(firstName, name);
    }

    @Override
    public List<StudentVO> findByFirstNameContaining(String firstName) {
        return studentRepository.findByFirstNameContaining(firstName);
    }

    @Override
    public List<StudentVO> getStudentsByFirstNameOrLastName(String firstName, String lastName) {
        return studentRepository.getStudentsByFirstNameOrLastName(firstName, lastName);
    }

    @Override
    public List<StudentVO> findById(int id) {
        return studentRepository.findById(id);
    }

//    @Override
//    public List<StudentVO> findByClassesVO_ClassName(String classes) {
//        return studentRepository.findByClassesVO_ClassName(classes);
//    }
//
//    @Override
//    public List<StudentVO> getByClassName(String className) {
//        return studentRepository.getByClassName(className);
//    }
}
