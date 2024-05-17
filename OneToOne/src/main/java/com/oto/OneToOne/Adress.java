package com.oto.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adress")
public class Adress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aid",length = 20)
	private int a_id;
	@Column(name="streetname",length = 50)
	private String street;
	@Column(name="city",length=20)
	private String city;
	@Column(name="state",length=20)
	private String state;
	@Column(name="pincode",length=20)
	private String pinno;
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(String street, String city, String state, String pinno) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinno = pinno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinno() {
		return pinno;
	}
	public void setPinno(String pinno) {
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "Adress [a_id=" + a_id + ", street=" + street + ", city=" + city + ", state=" + state + ", pinno="
				+ pinno + "]";
	}
	
	
}
