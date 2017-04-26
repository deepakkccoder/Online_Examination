package edu.mum.onlinetest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.onlinetest.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long> {

}
