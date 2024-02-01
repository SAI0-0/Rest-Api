package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.model.Student;

@Service
public interface StudentService {
	
	public String upsert(Student student);
	
	public Student getById(Integer sid);
	
	public List<Student> getAllStudents();
	
	public String deleteById(Integer sid);

}
