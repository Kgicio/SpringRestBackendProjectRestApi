package com.springrest.springrest.services;

import java.util.ArrayList;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CouseService {
	@Autowired
    private CourseDao courseDao;

		
	@Override
	public List<Course> getCourses(){
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		
		return courseDao.getReferenceById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		courseDao.getReferenceById(parseLong);
		Course entity=courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
		
	}
	
	
	

}
