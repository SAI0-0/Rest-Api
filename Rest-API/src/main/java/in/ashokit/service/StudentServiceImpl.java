package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.model.Student;
import in.ashokit.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	

	@Override
	public String upsert(Student student) {
		studentRepo.save(student);
		return "Success";
	}

	@Override
	public Student getById(Integer sid) {
		Optional<Student> findById=studentRepo.findById(sid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public String deleteById(Integer sid) {
		if(studentRepo.existsById(sid)) {
		   studentRepo.deleteById(sid);
		   return "Delete Success";
		}
		else {
			return "No Records";
		}
	
	}

}
