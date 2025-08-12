package com.mariam.spring_JPA_hibernate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mariam.spring_JPA_hibernate.config.AppConfig;
import com.mariam.spring_JPA_hibernate.entity.Student;
import com.mariam.spring_JPA_hibernate.repository.StudentDao;

@SpringBootApplication
public class App {
	
	
	
    public static void main( String[] args )
    
    {
    	ConfigurableApplicationContext container= SpringApplication.run(App.class, args);
    	StudentDao studentDao= container.getBean("studentDao", StudentDao.class);

		Student s = new Student("doaa" , 85);
		//studentDao.save(s);
		
	    Student student=studentDao.findById(5).get();
	    System.out.println(student);
	    
	    List<Student> students=studentDao.findAll();
	    for (Student ss : students) {
		      System.out.println("student NO "+ ss.getId() +" : " +ss);
		}
	    
    }
}
