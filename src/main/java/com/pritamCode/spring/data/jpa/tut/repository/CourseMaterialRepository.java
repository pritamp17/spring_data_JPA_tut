package com.pritamCode.spring.data.jpa.tut.repository;

import com.pritamCode.spring.data.jpa.tut.entity.CourseMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository  extends JpaRepository<CourseMaterial,Long> {



}
