package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "reader")
public class Reader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "readerId", nullable = false)
	int raderId;
	@Column(name = "email")
	String email;
	@Column(name = "firstName")
	String firstName;
	@Column(name = "lastName")
	String lastName;

	@ManyToMany
	@JoinTable(

			name = "reader_subscription", joinColumns = @JoinColumn(name = "readerId"), inverseJoinColumns = @JoinColumn(name = "subscriptionId"))
	Set<Subscription> subscription;

	public int getRaderId() {
		return raderId;
	}

	public void setRaderId(int raderId) {
		this.raderId = raderId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Subscription> getSubscription() {
		return subscription;
	}

	public void setSubscription(Set<Subscription> subscription) {
		this.subscription = subscription;
	}

	public void addSubscription(Subscription sub) {
		if (subscription == null) {
			subscription = new HashSet<>();
		}
		subscription.add(sub);
	}

}
