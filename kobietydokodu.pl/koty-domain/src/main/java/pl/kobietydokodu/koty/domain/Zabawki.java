package pl.kobietydokodu.koty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Zabawki {
	
	@Id
	@GeneratedValue
	Long id;

	String nazwa;
	
	/*@ManyToOne
	@JoinColumn(name="kot_id")
	private Kot kot;*/

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
}
