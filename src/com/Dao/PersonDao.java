package com.Dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;
import com.sun.xml.bind.v2.model.core.ID;

public class PersonDao extends HibernateDaoSupport
{
	
 public  void insert(Person p)
 {
	 getHibernateTemplate().save(p);
 }
 
 public List<Person> getalldetail()
 {
	 List<Person> list= getHibernateTemplate().find("from Person");
	 return list;
 }
	

 public  void delete(int id)
 {
	 HibernateTemplate ht = getHibernateTemplate();
	 Person p = ht.get(Person.class, id);
	 getHibernateTemplate().delete(p);
 }
	
public  void update(Person p)
{
	 getHibernateTemplate().update(p);
}
public Person getitembyid(int id)
{
	HibernateTemplate ht= getHibernateTemplate();
	Person p= ht.get(Person.class, id);
	return p;
}

 
}
