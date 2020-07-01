package training.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catagory {
	@Id
	private int CatagoryId;
	public int getCatagoryId() {
		return CatagoryId;
	}
	public void setCatagoryId(int catagoryId) {
		CatagoryId = catagoryId;
	}
	public String getCatagoryType() {
		return CatagoryType;
	}
	public void setCatagoryType(String catagoryType) {
		CatagoryType = catagoryType;
	}
	private String CatagoryType;
	

}
