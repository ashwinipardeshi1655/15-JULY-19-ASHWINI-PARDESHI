package com.ust.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pencils")
public class Pencils {
	
	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@Column
	private String pbrand;

	@OneToMany(mappedBy = "pencil")
	
	
	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	
	
}
