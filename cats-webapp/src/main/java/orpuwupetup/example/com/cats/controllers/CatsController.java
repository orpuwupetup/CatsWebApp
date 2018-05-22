package orpuwupetup.example.com.cats.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import orpuwupetup.example.com.cats.application.CatDAO;

@Controller
public class CatsController{
	
	@Autowired
	CatDAO dao;
	
	@RequestMapping("/")
	public String mainPage() {
		return "main";
	}
	
	@RequestMapping("/list")
	public String catsList(Model model) {
		model.addAttribute("cats", dao.getCatsList());
		return "list";
	}
	
	@RequestMapping("/add")
	public String addCat(Model model) {
		return "add";
	}
	
	@RequestMapping("/cat-{id}")
	public String catsDetails(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("cat", dao.getCatById(id));
		return "details";
	}
}