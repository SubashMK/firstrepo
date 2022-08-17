/**
 * 
 */
package com.stg.service;

import com.stg.model.Student;

/**
 * @author training
 *
 */
public interface StudentService {

	public abstract Student createStudent(Student details) throws Exception;

	public abstract Student readByStudId(Student student, int readStudId) throws Exception; 
	
	public abstract Student readByStudName(Student student, String readStudName) throws Exception;
	
	

}
