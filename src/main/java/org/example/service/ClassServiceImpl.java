package org.example.service;

import org.example.entity.ClassesVO;
import org.example.entity.StudentVO;
import org.example.repository.ClassesRepository;
import org.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    private ClassesRepository classesRepository;

    public ClassServiceImpl(ClassesRepository classesRepository) {
        super();
        this.classesRepository = classesRepository;
    }

    @Override
    public List<ClassesVO> findByStudentVO_FirstName(String firstName) {
        return classesRepository.findByStudentVO_FirstName(firstName);
    }
}
