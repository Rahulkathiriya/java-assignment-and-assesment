package model;

import jakarta.persistence.*;

@Entity
@Table(name = "studentDetail")

public class studentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressId")
	int addressId;
	@Column(name = "address")
	String address;
	@Column(name = "city")
	String city;
	@Column(name = "state")
	String state;
	@Column(name = "pinCode")
	int pinCode;

	@OneToOne(mappedBy = "studentDetail", cascade = CascadeType.ALL)
	student student;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public student getStudent() {
		return student;
	}

	public void setStudent(student student) {
		this.student = student;
	}

}
