package com.springrest.main.services;

import java.util.List;

import com.springrest.main.entity.Course;

public interface CourseService {
	List<Course> getCourses();

	Course getCourse(long courseId);

	Course addCourse(Course course);
}
