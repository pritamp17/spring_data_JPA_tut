package com.pritamCode.spring.data.jpa.tut.repository;

import com.pritamCode.spring.data.jpa.tut.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
