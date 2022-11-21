package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Nominees")
public class Nominees {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nominee_Id")
private int id;
	@Column(name="Name")
private String name;
	@ManyToMany(mappedBy="list")
	private List<Users> userList=new ArrayList<Users>();
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
	public List<Users> getUserList() {
		return userList;
	}
	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}
	public Nominees(String name) {
		super();
		this.name = name;
	}
	
}
