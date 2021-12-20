package carrello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrelloTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testCarrello() {
		
		Carrello carrello = new Carrello();
		int expected = 0;
		assertEquals(expected, carrello.getAmount());
		
	}

	@Test
	public void testGetAmount() {
	
	}

	@Test
	public void testInsertOneProduct() {
		Carrello carrello = new Carrello();
		int expected = 3;
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		assertEquals(expected, carrello.getAmount());
	}

	@Test
	public void testRemoveOneProduct() {
		Carrello carrello = new Carrello();
		int expected = 0;
		carrello.removeOneProduct();
		assertEquals(expected, carrello.getAmount());
		System.out.println("ciao");

		System.out.println("terminato");
		System.out.println("MODIFICA LOCALE");
		System.out.println("Modifica da Github");
		

		

		
	}

}
