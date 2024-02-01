package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Serializable> {

}
