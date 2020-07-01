package training.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Contractor")
public class Contractor {
	@Id
	private int ContractorId;
	
	private String frstname;
	private String lastname;
	private Date   Birthdate;
	private String gender;
	private String mail;
	private String Mobile;
	private String Status;
	private Date AppliedDate;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Address address;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Catagory catagory;
	
	public Date getAppliedDate() {
		return AppliedDate;
	}
	public void setAppliedDate(Date appliedDate) {
		AppliedDate = appliedDate;
	}
 
	
	public Catagory getCatagory() {
		return catagory;
	}
	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private String Mail;
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	public int getContractorId() {
		return ContractorId;
	}
	public void setContractorId(int contractorId) {
		ContractorId = contractorId;
	}
	public String getFrstname() {
		return frstname;
	}
	public void setFrstname(String frstname) {
		this.frstname = frstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	
	

}
