package training.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
private int AddressId;
private String city;
private String state;
private long pincone;
public int getAddressId() {
	return AddressId;
}
public void setAddressId(int addressId) {
	AddressId = addressId;
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
public long getPincone() {
	return pincone;
}
public void setPincone(long pincone) {
	this.pincone = pincone;
}



}
