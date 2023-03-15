package com;
import javax.persistence.*;


@Entity
public class Account {
	private int account_holderId;
	private String account_type;
	private int total_amount;
	private Customer cst;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account( String account_type, int total_amount, Customer cst) {
		super();
		this.account_holderId = account_holderId;
		this.account_type = account_type;
		this.total_amount = total_amount;
		this.cst = cst;
	}
	
	
@Id
@Column(name="account_holder_id_no")
@GeneratedValue

	public int getAccount_holderId() {
		return account_holderId;
	}
	public void setAccount_holderId(int account_holderId) {
		this.account_holderId = account_holderId;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id_no")  //foreign key
	
	
	
	public Customer getCst() {
		return cst;
	}
	public void setCst(Customer cst) {
		this.cst = cst;
	}
	@Override
	public String toString() {
		return "Account [account_holderId=" + account_holderId + ", account_type=" + account_type + ", total_amount="
				+ total_amount + ", cst=" + cst + "]";
	}

   


}
