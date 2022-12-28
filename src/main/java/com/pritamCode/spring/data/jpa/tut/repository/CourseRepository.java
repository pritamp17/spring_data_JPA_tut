package com.pritamCode.spring.data.jpa.tut.repository;

import com.pritamCode.spring.data.jpa.tut.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
public interface CourseRepository extends JpaRepository<Course,Long> {
    Page<Course> findByTitleContaining(
            String title,
            Pageable pageable);
}
