package com.springmvcProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvcDemo.model.Empl;
import com.springmvcProject.dao.EmplDao;

@Controller
public class EmplController {
	@Autowired
	EmplDao emplDao;
	
	@RequestMapping("/emplform")
	public String showForm(Model m) {
		m.addAttribute("command",new Empl());
		return "emplform";
	}
	
	//ModelAttribute-> req. data is put into model obj
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("empl") Empl empl) {
		emplDao.save(empl);
		return "redirect:/viewemp";
	}

	@RequestMapping(value="/editempl/{id}")
	public String edit(@PathVariable int id,Model m) {
		Empl e=emplDao.getEmpl(id);
		m.addAttribute("command",e);
		return "empledit";
	}
	
	@RequestMapping(value="/viewform")
	public String viewemp(Model m)
	{
		List<Empl> list = emplDao.getEmployees();
		m.addAttribute("list",list);
		return "viewform";
	}
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editsave(@ModelAttribute("empl") Empl empl)
	{
		emplDao.update(empl);
		return "redirect:/viewempl";
	}
	
	@RequestMapping(value="/deleteempl/{id}",method=RequestMethod.POST)
	public String delete(@PathVariable int id) {
		emplDao.delete(id);
		return "redirect:/viewempl";
	}
}