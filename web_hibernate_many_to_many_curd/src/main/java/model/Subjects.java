package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class Subjects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_id", nullable = false)
	int sub_id;
	@Column(name = "subName")
	String subName;

	@ManyToMany
	@JoinTable(name = "faculty_subjects", joinColumns = @JoinColumn(name = "sub_id"), inverseJoinColumns = @JoinColumn(name = "fid"))
	List<Faculty> faculty;

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public List<Faculty> getFaculty() {
		return faculty;
	}

	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}

	public void addFaculty(Faculty f) {
		if (faculty == null) {
			faculty = new ArrayList<Faculty>();
		}
		faculty.add(f);
	}

}
