package training.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	@Id
	private String ClientId;
	private String FirstName;
	private String LastName;
	private String Mail;
	
	private String Mobile;
	private String gmail;

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
	private String message;
	private String CompanyName;
	@OneToOne(cascade=CascadeType.MERGE)
	private Job job;
	@OneToOne(cascade=CascadeType.MERGE)
	private Catagory catagory;
	
	;
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	@OneToOne(cascade=CascadeType.MERGE)
	private Address address;

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	@OneToOne(cascade=CascadeType.ALL)
	private Education Edu;
	@OneToOne(cascade=CascadeType.ALL)
	private Address add;
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}

	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	public Education getEdu() {
		return Edu;
	}
	public void setEdu(Education edu) {
		Edu = edu;
	}
	
	
	
	
	
	
	
	
	
	

}
