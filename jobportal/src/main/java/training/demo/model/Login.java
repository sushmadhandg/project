package training.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {

	@Id
	private String loginId;
	private String userName;
	private String password;
	@OneToOne(cascade=CascadeType.MERGE)
	private Role role;
	
	
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ "]";
	}
	public Login() {
		super();
	}
	public Login(String userName2, String password2) {
		// TODO Auto-generated constructor stub
		this.userName=userName2;
		this.password=password2;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
	
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
