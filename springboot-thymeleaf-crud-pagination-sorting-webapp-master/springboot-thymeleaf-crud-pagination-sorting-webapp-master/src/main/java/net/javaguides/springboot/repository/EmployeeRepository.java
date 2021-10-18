package net.javaguides.springboot.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
  
	@Query(value = "SELECT * FROM employees where salary>=:llimit AND salary<=:ulimit",nativeQuery = true)
	public Collection<Employee> findAfterFilter(@Param("llimit") String llimit,@Param("ulimit") String ulimit); 
	
}
