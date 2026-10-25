package ma.ensaf.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ma.ensaf.springbootjpa.dao.PersonneRepository;
import ma.ensaf.springbootjpa.model.Personne;

@Controller
public class PersonneController {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping(value= "/addPerson")
	public String addPerson() {
		return "addPerson";
	}
	

	@PostMapping(value = "/addPerson")
	public ModelAndView addPerson(@RequestParam(value = "nom") String nom, @RequestParam(value = "prenom") String prenom) {
//		creer un objet personne
		Personne personne = new Personne(nom, prenom);
		
//		enregistrer l'objet dans la bdd
		personneRepository.save(personne);
		
//		Envoyer les donnees a la vue
		ModelAndView mv = new ModelAndView();
		mv.setViewName("comfirm");
		mv.addObject("nom", nom);
		mv.addObject("prenom", prenom);
		return mv;
	}
	
	@GetMapping(value = "/showAll")
	public ModelAndView showAll() {
	List<Personne> personnes = personneRepository.findAll();
	ModelAndView mv= new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes);
	return mv;
	}

}
