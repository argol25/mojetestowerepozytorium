package pl.kobietydokodu.koty.domain;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import pl.kobietydokodu.koty.domain.Kot;

@Repository
public class KotDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	//List<Kot> koty = new ArrayList<Kot>();
	
	@Transactional
	public void dodajKota(Kot kot) {
		entityManager.persist(kot);
		//koty.add(kot);
	}
	
	@Transactional
	public List<Kot> getKoty() {
		Query query = entityManager.createQuery("SELECT k FROM Kot k");
		List<Kot> koty = query.getResultList();
		return koty;
	}
	
	@Transactional
	public Kot getKotById(Long id) {
		/*if (id<koty.size()) {
			return koty.get(id);
		} else {
			return null;
		}*/
		return entityManager.find(Kot.class, id);
	}
	
	/*
	 * CREATE TABLE koty(
	 * 	'id' INT PRIMARY KEY,
	 *  'imie' VARCHAR(255),
	 *  'dataUrodzenia' DATE,
	 *  'waga' NUMERIC(10,2),
	 *  'imieOpiekuna' VARCHAR(255)
	 * )
	 * 
	 * 1. dodajKota
	 * INSERT INTO 'koty' VALUES (index, 'imie', dataUrodzenia, waga, 'imieOpiekuna') 
	 * 
	 * 2. getKoty
	 * SELECT * FROM 'koty';
	 * 
	 * 3. getKotById (index in)
	 * SELECT * FROM 'koty' WHERE 'id' = in;
	 * 
	 */
	
}
