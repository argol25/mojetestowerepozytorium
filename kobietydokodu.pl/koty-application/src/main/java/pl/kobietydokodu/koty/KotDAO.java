package pl.kobietydokodu.koty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pl.kobietydokodu.koty.domain.Kot;

@Repository
public class KotDAO {

	List<Kot> koty = new ArrayList<Kot>();
	
	public void dodajKota(Kot kot) {
		koty.add(kot);
	}
	
	public List<Kot> getKoty() {
		return koty;
	}
	
	public Kot getKotById(Integer id) {
		if (id<koty.size()) {
			return koty.get(id);
		} else {
			return null;
		}
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
