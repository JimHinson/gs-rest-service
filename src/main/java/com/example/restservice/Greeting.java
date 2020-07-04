package com.example.restservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="greeting")
public class Greeting {

	@Id
	@GeneratedValue
	private final long id;
	@Column(name="name")
	private final String name;
	@Column(name="gift")
	private final String gift = "";

	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	public String getGift
}
