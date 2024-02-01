package in.ashokit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu_dtls")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stuid;
	private String name;
	private Integer age;
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(Integer stuid, String name, Integer age) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", name=" + name + ", age=" + age + "]";
	}
	

}
