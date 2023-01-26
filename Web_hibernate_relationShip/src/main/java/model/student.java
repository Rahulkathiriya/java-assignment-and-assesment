package model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;

	@Column(name = "name")
	String name;

	@Column(name = "email")
	String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	studentDetail studentDetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public studentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(studentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

}
