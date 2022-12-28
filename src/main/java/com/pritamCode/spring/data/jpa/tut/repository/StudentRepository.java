package com.pritamCode.spring.data.jpa.tut.repository;
import com.pritamCode.spring.data.jpa.tut.entity.Student;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
   public List<Student> findByFirstName(String firstName);

   List<Student> findByFirstNameContaining(String name);

   List<Student> findByLastNameNotNull();

   List<Student> findByGuardianName(String guardianName);

   Student findByFirstNameAndLastName(String firstName,
                                      String lastName);

   //JPQL
   @Query("select s from Student s where s.emailId = ?1")
   Student getStudentByEmailAddress(String emailId);

   //Native
   @Query(
           value = "SELECT * FROM tbl_student s where s.email_address = ?1",
           nativeQuery = true
   )
   Student getStudentByEmailAddressNative(String emailId);

   //Native Named Param
   @Query(
           value = "SELECT * FROM tbl_student s where s.email_address = :emailId",
           nativeQuery = true
   )
   Student getStudentByEmailAddressNativeNamedParam(
           @Param("emailId") String emailId
   );

   @Modifying
   @Transactional
   @Query(
           value = "update tbl_student set first_name = ?1 where email_address = ?2",
           nativeQuery = true
   )
   int updateStudentNameByEmailId(String firstName, String emailId);


}
