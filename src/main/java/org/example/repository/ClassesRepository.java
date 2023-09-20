package org.example.repository;

import org.example.entity.ClassesVO;
import org.example.entity.StudentVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepository extends JpaRepository<ClassesVO, Integer> {

    List<ClassesVO> findByStudentVO_FirstName(String firstName);
}
