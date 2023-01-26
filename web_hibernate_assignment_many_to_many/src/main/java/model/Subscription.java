package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "subscription")
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subscriptionId")
	int subscriptionId;
	@Column(name = "subscriptionName")
	String subscriptionName;
	@ManyToMany
	@JoinTable(

			name = "reader_subscription", joinColumns = @JoinColumn(name = "subscriptionId"), inverseJoinColumns = @JoinColumn(name = "readerId"))
	Set<Reader> reader;

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public Set<Reader> getReader() {
		return reader;
	}

	public void setReader(Set<Reader> reader) {
		this.reader = reader;
	}

	public void addReader(Reader r) {
		if (reader == null) {
			reader = new HashSet<>();
		}
		reader.add(r);
	}

}
