package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bo.PersonBo;
import com.model.Person;
@Controller
public class MyController
{
	private static final String PersonBo = null;
	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	
	public String insert(HttpServletRequest req, HttpServletResponse resp)
	{
		Person p = new Person();
		p.setName(req.getParameter("name"));
		p.setAddress(req.getParameter("address"));
		
		ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
		PersonBo pbo = (PersonBo) con.getBean("personBo");
		pbo.insert(p);
		return "show";
		
		
	}
@RequestMapping(value="/insert1",method=RequestMethod.GET)
	
	public String insert1()
	{
		return "index";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete(HttpServletResponse resp,HttpServletRequest req)
	{
		
		int id=Integer.parseInt(req.getParameter("id"));
		ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
		PersonBo pbo =(PersonBo) con.getBean("personBo");
		pbo.delete(id);
		
		return "show";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String show()
	{
		return "show";
	}
	 @RequestMapping(value="/edit",method=RequestMethod.POST)
	 public String edit(HttpServletRequest req,HttpServletResponse resp,ModelMap map)
	 {
		 int id=Integer.parseInt(req.getParameter("id"));
		 ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
		 PersonBo pbo=  (PersonBo) con.getBean("personBo");
		 Person p =pbo.getitem(id);
		 map.addAttribute("p", p);
		 return "update";
	 }
	 
	 @RequestMapping(value="/update",method=RequestMethod.POST)
	 public String update(HttpServletRequest req,HttpServletResponse resp)
	 {
		 Person p = new Person();
		 p.setId(Integer.parseInt(req.getParameter("id")));
		 p.setName(req.getParameter("name"));
		 p.setAddress(req.getParameter("address"));
		 ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
		 PersonBo pbo=  (PersonBo) con.getBean("personBo");
		 pbo.update(p);
		 return "show";
	 }
}
