package pl.kobietydokodu.koty.domain;

//import java.util.ArrayList;
import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import pl.kobietydokodu.koty.domain.Kot;

@Repository
public interface KotDAO extends CrudRepository<Kot, Long> {

	public Kot findById(Long id);
	//List<Kot> findById(Long id);

	// List<Kot> findBy

	// @PersistenceContext
	// EntityManager entityManager;

	// List<Kot> koty = new ArrayList<Kot>();

	/*
	 * @Transactional public void dodajKota(Kot kot) {
	 * entityManager.persist(kot); //koty.add(kot); }
	 * 
	 * @Transactional public List<Kot> getKoty() { Query query =
	 * entityManager.createQuery("SELECT k FROM Kot k"); List<Kot> koty =
	 * query.getResultList(); return koty; }
	 * 
	 * /*@Transactional public Kot getKotById(Long id) { return
	 * entityManager.find(Kot.class, id); }
	 */
}
