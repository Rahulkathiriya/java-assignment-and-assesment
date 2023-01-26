package model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")

public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	@Column(name = "pname")
	String pname;
	@Column(name = "price")
	int price;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "cid")
	catagory catagory;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(catagory catagory) {
		this.catagory = catagory;
	}

}
