package com.ust.many2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column
	private int sid;
	
	@Column
	private String sname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "students_courses" , joinColumns = @JoinColumn(name = "sid"),
	inverseJoinColumns = @JoinColumn(name = "cid"))
	private List<Courses> course;
	
	public List<Courses> getCourse() {
		return course;
	}
	public void setCourse(List<Courses> course) {
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	

}
