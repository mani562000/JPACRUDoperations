package com.example.boot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.boot.jpa.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{
    
	
	public List<User> findByFirstname(String firstname);
	
	public List<User> findByFirstnameAnaCity(String firstname, String city);
	
	@Query("Select u FROM User u")
	public List<User> getAllUsers();
	
	@Query("Select u FROM user u Where u.name =:n")
	public List<User> getUserByFirstname(@Param("n")String firstname);
	
	@Query("Selrct u FROM User u Where u.name =:n and u.city=:c")
	public List<User> getUserByFirstnameAndCity(@Param("n")String firstname, @Param("c")String city);
	
	@Query(value="Select * From user", nativeQuery=true)
	public List<User> getUsers();
}
