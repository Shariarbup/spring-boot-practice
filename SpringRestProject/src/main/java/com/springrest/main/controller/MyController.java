package com.springrest.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.main.entity.Course;
import com.springrest.main.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is my home page";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable long courseId) {
		return this.courseService.getCourse(courseId);
	}
	
	@PostMapping(path="/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
}
