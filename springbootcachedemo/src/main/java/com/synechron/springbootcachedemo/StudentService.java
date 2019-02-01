package com.synechron.springbootcachedemo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Cacheable("anylogicalname")
	public Student getStudentById(Long id)
	{
		try {
			System.out.println("Going to sleep for id " + id +" for 10 sec");
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Student(1l,"Navneet","ECK");
	}
	
	
	
}
