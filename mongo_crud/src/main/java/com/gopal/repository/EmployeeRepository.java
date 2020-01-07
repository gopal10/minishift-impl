/**
 * 
 */
package com.gopal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gopal.entity.Employee;

/**
 * @author GopalPanchal
 *
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	
}
