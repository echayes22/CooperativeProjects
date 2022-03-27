package junit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Customer;

public class CustomerTest {
	@Test
	public void testCustomerConstructor() throws Exception {
		Customer mike = new Customer("Mike", 20);
		assertTrue(mike.getName().equals("Mike"));
		assertTrue(mike.viewWallet()==(20));
		
	}
	
	@Test
	public void testSetName() throws Exception{
		Customer Jimmy=new Customer("Jimmy", 324);
		
		Jimmy.setName("Ram");
		assertEquals(Jimmy.getName(), "Ram");
	}
	
	@Test
	public void testSetEmptyName() throws Exception
	{
		Customer David=new Customer("David", 324);
		
		David.setName("");
		assertEquals(David.getName(), "");
	}
	@Test
	public void testSetNullName() throws Exception
	{
		Customer David=new Customer("David", 324);
		
		David.setName(null);
		assertEquals(David.getName(), null);
	}
	
	@Test
	public void testNegativeMoney() {
		boolean testFailed = false;

		try {
			Customer David = new Customer("David", -5);
		} catch(Exception e) {
			testFailed = true;
		} finally {
			assertTrue(testFailed);
		}
	}
	
	@Test
	public void testZeroMoney() throws Exception
	{
		Customer c=new Customer("Nobody", 0);
		
		assertEquals(c.viewWallet(), 0);
	}
	

}
