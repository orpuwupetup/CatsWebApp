package orpuwupetup.example.com.cats.controllers;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import orpuwupetup.example.com.cats.application.CatDAO;
import orpuwupetup.example.com.cats.domain.Cat;
import orpuwupetup.example.com.cats.dto.CatDTO;

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
	public String addCat(HttpServletRequest request, @ModelAttribute("catDto") @Valid CatDTO catDto, BindingResult result) {
		
		// check if request was made via 'POST' method, or if there are no empty lines left by the user in our form
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			
			// make instances of object we need to add new cat to our database
			Cat cat = new Cat();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			
			// try to parse birth date of the cat to correct format
			try {
				cat.setBirthDate(sdf.parse(catDto.getBirthDate()));
			} catch (ParseException pe) {
				pe.printStackTrace();
			}
			
			// add to cat all values passed by the user to the form 
			cat.setName(catDto.getName());
			cat.setOwnersName(catDto.getOwnersName());
			cat.setWeight(catDto.getWeight());
			dao.putInCat(cat);
			
			return "redirect:/list";
		}
		
		return "add";
	}
	
	@RequestMapping("/cat-{id}")
	public String catsDetails(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("cat", dao.getCatById(id));
		return "details";
	}
}