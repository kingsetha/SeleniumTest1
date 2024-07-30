package com.ani.test.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cust")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column
	private String cname;
	@Column
	private String count;
	@Column
	private String address;
	@OneToOne(targetEntity=Movie.class,cascade=CascadeType.ALL)
	@JoinColumn(name="mid")
	private Movie movie;
	public Customer() {
		super();
		
	}
	public Customer(int cid, String cname, String count, String address, Movie movie) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.count = count;
		this.address = address;
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Mobile [cid=" + cid + ", cname=" + cname + ", count=" + count + ", address=" + address
				+ ", movie=" + movie + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getcount() {
		return count;
	}
	public void setcount(String count) {
		this.count = count;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Movie getRepair() {
		return movie;
	}
	public void setRepair(Movie movie) {
		this.movie = movie;
	}
	
	

}
