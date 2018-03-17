package pl.kobietydokodu.koty.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.Date;

import org.mockito.runners.MockitoJUnitRunner;

import pl.kobietydokodu.koty.domain.DAOservices;
import pl.kobietydokodu.koty.domain.Kot;

@RunWith(MockitoJUnitRunner.class)
public class DAOserviceTest {

	DAOservices daos;

	@Mock
	Kot kot;

	@Before
	public void setUp() {
		daos = new DAOservices();
		Date d = new Date(2017 / 01 / 01);
		Float f = new Float(4.5);

		// kot = null;
		kot.setImie("Jan");
		kot.setWaga((float) (4.5));
		kot.setDataUrodzenia(d);	
		kot.setImieOpiekuna("On");
		
		
		 when(kot.getImie()).thenReturn("Jan");
		 when(kot.getDataUrodzenia()).thenReturn(d);
		 when(kot.getImieOpiekuna()).thenReturn("Marek");
		 when(kot.getWaga()).thenReturn(f);
		
	}

	@Test
	public void test() {
		//assertNotNull("obiekt nie jest pusty", kot);
		when(daos.findCat(Matchers.anyLong())).thenReturn(kot);
		assertEquals(daos.findCat(Matchers.anyLong()),kot);

	}

}
