package com.spring.SpringMVC.Repo;

import com.spring.SpringMVC.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoderRepo extends JpaRepository<Student,Integer> {
Student findBySname(String name);

//query dsl
    @Query(value ="select * from student where mark= :mark", nativeQuery = true)
    List<Student> findByMark(@Param("mark") int mark);

    @Query(value ="select * from student where mark Between 85 And 100", nativeQuery = true)
    List<Student> findAllByMarks();
}
