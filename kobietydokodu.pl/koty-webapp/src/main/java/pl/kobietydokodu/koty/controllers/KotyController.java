package pl.kobietydokodu.koty.controllers;

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

import pl.kobietydokodu.koty.domain.KotDAO;
import pl.kobietydokodu.koty.dto.KotDTO;
import pl.kobietydokodu.koty.domain.Kot;

@Controller
public class KotyController {

	@Autowired
	protected KotDAO dao;
	
	@RequestMapping("/lista")
	public String listaKotow(Model model) {
		model.addAttribute("koty", dao.findAll());
		return "lista";
	}
	
	@RequestMapping("/dodaj")
	public String dodajKota(HttpServletRequest request, @ModelAttribute("kotDto") @Valid KotDTO kotDto, BindingResult result) {
		//sprawdza czy użyta metoda to post i czy nie ma błędów
		if(request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			Kot kot = new Kot();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			
			/*odnosi się do koty-domain i klasy Kot, wstawia wartości za pomocą  
			getterówDTO(and. data transfer object) - obiektu stworzonego tylko 
			i wyłącznie w celu przesłania danych z jednego miejsca w drugie.*/
			try{
				kot.setDataUrodzenia(sdf.parse(kotDto.getDataUrodzenia()));
			}catch(ParseException e){
				e.printStackTrace();
			}
			kot.setImie(kotDto.getImie());
			kot.setImieOpiekuna(kotDto.getImieOpiekuna());
			kot.setWaga(kotDto.getWaga());
			dao.save(kot);
			//dao.dodajKota(kot);
			return "redirect:/lista";
		}
		
		return "dodaj";
	}
	
	@RequestMapping("/kot-{id}")
	public String szczegolyKota(@PathVariable("id") Long id, Model model) {
		model.addAttribute("kot", dao.findOne(id+1));
		return "szczegoly";
	}
	
}
