package junit_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import application.Product;

class ProductTest {

	@Test
	public void testDryProductConstrutor() {
		String date = "10/10/2021";
		Product product = new Product("Doritos",1.75,"FirtoLay", date, "Dry");
		assertTrue(product.getName().equals("Doritos"));
		assertTrue(product.getPrice() == 1.75);
		assertTrue(product.getManufacturer().equals("FirtoLay"));
		assertTrue(product.getType().equals("Dry"));

	}
	@Test
	void testColdProductConstrutor() {
		String date = "10/10/2021";
		Product product = new Product("Doritos",1.75,"FirtoLay", date, "Dry",50,55 );
		assertTrue(product.getName().equals("Doritos"));
		assertTrue(product.getPrice() == 1.75);
		assertTrue(product.getManufacturer().equals("FirtoLay"));
		assertTrue(product.getType().equals("Dry"));
	}

}
