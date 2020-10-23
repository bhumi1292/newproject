package com.Bo;

import java.util.List;

import com.Dao.PersonDao;
import com.model.Person;

public class PersonBo 
{
	PersonDao persondao;

	public PersonDao getPersondao() {
		return persondao;
	}

	public void setPersondao(PersonDao persondao) {
		this.persondao = persondao;
	}
	
	public void insert(Person p)
	{
		persondao.insert(p);
	}
	public List<Person> getall()
	{
		 return persondao.getalldetail();
	}
	public void delete(int id)
	{
		persondao.delete(id);
	}
	public void update(Person p)
	{
		persondao.update(p);
	}
	
	public Person getitem(int id)
	{
		 return persondao.getitembyid(id);
	}
	
}
