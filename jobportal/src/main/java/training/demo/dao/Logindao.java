package training.demo.dao;


import training.demo.model.Login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Logindao {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public  Login Validate(Login login) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Login where password=:pwd and userName=:uname");
		query.setParameter("pwd",login.getPassword() );
		query.setParameter("uname", login.getUserName());
	
		List<Login> list= query.list();
		System.out.println(list);
		for(Login l:list)
		{
			if(l.getPassword().equals(login.getPassword())&&l.getUserName().equals(login.getUserName()))
			{
			  return list.get(0);
			}
			
		}
		return null;
	}
	

}
