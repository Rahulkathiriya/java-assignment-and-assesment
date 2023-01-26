package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fid")
	int fid;
	@Column(name = "faclutyName")
	String faclutyName;

	@ManyToMany
	@JoinTable(

			name = "faculty_subjects", joinColumns = @JoinColumn(name = "fid"), inverseJoinColumns = @JoinColumn(name = "sub_id")

	)

	List<Subjects> subjects;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFaclutyName() {
		return faclutyName;
	}

	public void setFaclutyName(String faclutyName) {
		this.faclutyName = faclutyName;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	public void addSubjects(Subjects s) {

		if (subjects == null) {
			subjects = new ArrayList<Subjects>();
		}
		subjects.add(s);
	}

}
