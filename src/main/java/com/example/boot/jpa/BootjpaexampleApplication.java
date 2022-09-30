package com.example.boot.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.boot.jpa.dao.UserRepository;
import com.example.boot.jpa.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	
	     UserRepository userRepository = context.getBean(UserRepository.class);
	     
	   //Insert operation: (Single Instance)
//	     User user = new User();
//	
//	     user.setFirstName("Raja");
//	     user.setLastName("Kumar");
//	     user.setMobNo(980897899);
//	     user.setEmailID("raja28@gmail.com");
//	     user.setGender("Male");
//	     user.setCity("Gurugram");
//	     user.setStatus("Single");  
//       User user1 = userRepository.save(user);
//       System.out.println(user1.toString());
//	  
	   
	     //Insert operation: (Multiple Instances)
//	     User user1 = new User();
//	
//	     user1.setFirstName("Raja");
//	     user1.setLastName("Kumar");
//	     user1.setMobNo(980897899);
//	     user1.setEmailID("raja28@gmail.com");
//	     user1.setGender("Male");
//	     user1.setCity("Gurugram");
//	     user1.setStatus("Single");  
//      
//	     User user2 = new User();
//	 	
//	     user2.setFirstName("Raju");
//	     user2.setLastName("Kumar");
//	     user2.setMobNo(989897899);
//	     user2.setEmailID("raju1228@gmail.com");
//	     user2.setGender("Male");
//	     user2.setCity("Gurugram");
//	     user2.setStatus("Single");
//	    
//	     User user3 = new User();
//		 	
//	     user3.setFirstName("Ritika");
//	     user3.setLastName("Sharma");
//	     user3.setMobNo(989897899);
//	     user3.setEmailID("ritikas1229@gmail.com");
//	     user3.setGender("Female");
//	     user3.setCity("Noida");
//	     user3.setStatus("Single");
//	     List<User> users = List.of(user1,user2,user3);
//	     userRepository.saveAll(users);
	     
	   
	     //Update Operation:
	     
//	     Optional<User> optional = userRepository.findById(6);
//         try {
//            User user = optional.get();
//	        user.setStatus("Single");
//	        userRepository.save(user);
//	        //System.out.println(user);
//	     }catch(Exception e)
//         {
//        	 e.printStackTrace();
//         }
	     
	    // how to get the data:(for one specific object)
//         Optional<User> optional = userRepository.findById(6);
//         try {
//            User user = optional.get();
//	        System.out.println(user);
//	     }catch(Exception e)
//         {
//        	 e.printStackTrace();
//         }
         // how to get the data:(for all object) 
        // Iterable<User> itr = userRepository.findAll();
//         try {
//         Iterator<User> iterator = itr.iterator();
//         while(iterator.hasNext())
//         {
//        	 User user = iterator.next();
//        	 System.out.println(user);
//         }
//         }catch(Exception e)
//         {
//        	 e.printStackTrace();
//         }
         
         //or:
//         itr.forEach(new Consumer<User>(){
//        	@Override 
//        	public void accept(User t)
//        	{
//        		System.out.println(t);
//        	}
//         });
         // Or:(Using lamdaExpression
         //itr.forEach(user->System.out.println(user));
         
         //Delete Operation:(one user)
	     try {
          userRepository.deleteById(12);
          System.out.println("Succesfully deleted");
	     }catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
         //Delete Operation: (all users)
	     Iterable<User> allUsers = userRepository.findAll();
	     userRepository.deleteAll(allUsers);
	
	}
	

}
