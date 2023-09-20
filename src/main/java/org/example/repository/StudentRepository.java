package org.example.repository;

import org.example.entity.StudentVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentVO, Integer> {
    List<StudentVO> findById(int id);

//    List<StudentVO> findByClassesVO_ClassName(String classes);

//    @Query("From StudentVO where classesVO.className= :className")
//    List<StudentVO> getByClassName(@Param("className") String className);

    List<StudentVO> findByFirstNameAndLastName(String firstName,String name);

    List<StudentVO> findByFirstNameContaining(String keyword);

    @Query("FROM StudentVO WHERE firstName = :firstName and lastName = :lastName")
    List<StudentVO> getStudentsByFirstNameOrLastName(@Param("firstName") String firstName,@Param("lastName") String lastName);
}
