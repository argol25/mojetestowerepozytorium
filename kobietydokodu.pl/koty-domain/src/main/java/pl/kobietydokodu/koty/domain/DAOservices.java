package pl.kobietydokodu.koty.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kobietydokodu.koty.domain.Kot;
import pl.kobietydokodu.koty.domain.KotDAO;

@Service
public class DAOservices {
	
	@Autowired
	protected KotDAO dao;
	
	public void saveCat(Kot kot){
		dao.save(kot);
	}
	
	public List<Kot> displayCats(){
		return (List<Kot>) dao.findAll();
	}
	
	public Kot findCat(Long id){
		//Kot kot = dao.findOne(id+1);
		return dao.findById(id+1);
	}
}
