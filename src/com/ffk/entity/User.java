package com.ffk.entity;

import java.io.Serializable;

public class User  implements Serializable{
	
	private int id;
	private String name;
	private String pwd;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(int id, String name, String pwd, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	}

	public User(String name, String pwd, String phone) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (obj instanceof User) {
	            User o = (User) obj;
	            return this.id == o.id;
	        }
	        return true;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+","+name+","+pwd+","+phone;
	}
	
}
