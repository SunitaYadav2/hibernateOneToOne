package com;
import javax.persistence.*;

@Entity
public class Customer {
	
	 private int customer_id;
	 private String customer_name;
	 private String customer_email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer( String customer_name, String customer_email) {
		super();
		
		this.customer_name = customer_name;
		this.customer_email = customer_email;
	}
	
	
@Id	
@Column(name="customer_id_no")

@GeneratedValue
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_email="
				+ customer_email + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
