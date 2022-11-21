package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="Name")
private String name;
	@Column(name="Email")
private String email;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Nominees> list=new ArrayList<Nominees>();

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

	public List<Nominees> getList() {
		return list;
	}

	public void setList(List<Nominees> list) {
		this.list = list;
	}

	public Users(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
}
