package com.stg.service;

import com.stg.model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student createStudent(Student student) throws Exception {
		if (String.valueOf(student.getStudId()).length() > 3 && student.getStudName().length() > 3) {
			return student;
		} else {
			throw new Exception("Invalid");
		}

	}

	@Override
	public Student readByStudId(Student student, int readStudId) throws Exception {
		if (student.getStudId() == (readStudId)) {
			return student;
		} else {
			throw new Exception("Match not found");
		}

	}

	@Override
	public Student readByStudName(Student student, String readStudName) throws Exception {
		if (student.getStudName().equals(readStudName)) {
		
			return student;
		} else {
			throw new Exception("Name not found");
		}
		
	}

}
