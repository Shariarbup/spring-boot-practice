package com.bjit.main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bjit.dao.StudentDao;
import com.bjit.dao.StudentDaoImpl;
import com.bjit.model.Student;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	StudentDaoImpl stdentDaoImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) {
		startTheApp();
	}

	void startTheApp() {

		// create books table
		jdbcTemplate.execute("DROP TABLE IF EXISTS student");
		jdbcTemplate.execute("CREATE TABLE student("
				+ "id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), address VARCHAR(255), phone VARCHAR(255))");

		List<Student> students = Arrays.asList(
				new Student("Md. Al Shariar", "Baridhara", "Phone"),
				new Student("Md. Al Shariar", "Baridhara", "Phone"),
				new Student("Md. Al Shariar", "Baridhara", "Phone"),
				new Student("Md. Al Shariar", "Baridhara", "Phone"));

		// saving the books
		students.forEach(student -> {
			stdentDaoImpl.save(student);
		});

		System.out.println("======================");
		// find all books
		List<Student> listOfStudents = stdentDaoImpl.findAllStudent();
		for (Student student : listOfStudents) {
			System.out.println(student.toString());
		}
		System.out.println("======================");

		// update record
		// find by id
		Optional<Student> student = stdentDaoImpl.findById(3);
		System.err.println(student.get().toString());

		student.get().setName("shakib");
		stdentDaoImpl.update(student.get());

		System.out.println("======================");

	}

}
