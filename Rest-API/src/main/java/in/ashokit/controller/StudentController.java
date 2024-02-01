package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Student;
import in.ashokit.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/stu")
	public ResponseEntity<String> createstu(@RequestBody Student student){
		String status=studentService.upsert(student);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	@GetMapping("course/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer sid){
		Student student=studentService.getById(sid);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(@RequestBody Student student){
		List<Student> allStudents=studentService.getAllStudents();
		return new ResponseEntity<>(allStudents,HttpStatus.OK);
	}
	@PutMapping("/student")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		String status=studentService.upsert(student);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	@DeleteMapping("/student/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer sid){
		String status=studentService.deleteById(sid);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	

}
