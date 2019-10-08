package com.ust.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "v_id")
	private VoterCard votercard;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public VoterCard getVotercard() {
		return votercard;
	}

	public void setVotercard(VoterCard votercard) {
		this.votercard = votercard;
	}

	
	

}
