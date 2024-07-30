package com.ani.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mov")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	
	@Column
	private String mname;
	
	@Column
	private String type;
	
	@Column
	private String timing;
	

	public Movie() {
		super();
		
	}


	public Movie(int mid, String mname, String type, String timing) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.type = type;
		this.timing = timing;
	}


	@Override
	public String toString() {
		return "Repair [mid=" + mid + ", mname=" + mname + ", type=" + type + ", timing=" + timing + "]";
	}


	public int getmid() {
		return mid;
	}


	public void setmid(int mid) {
		this.mid = mid;
	}


	public String getmname() {
		return mname;
	}


	public void setmname(String mname) {
		this.mname = mname;
	}


	public String gettype() {
		return type;
	}


	public void settype(String type) {
		this.type = type;
	}


	public String gettiming() {
		return timing;
	}


	public void settiming(String timing) {
		this.timing = timing;
	}

	

}
