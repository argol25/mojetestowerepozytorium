package pl.kobietydokodu.koty.domain;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.Table;

@Entity
//@Table(name="koty")
public class Kot {
	
	@Id
	@GeneratedValue
	private Long id;
	
    private String imie;
	 
    private Date dataUrodzenia;
    private Float waga;
    private String imieOpiekuna;
    
    /*@OneToMany
    private Zabawki zabawka;*/

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

}
