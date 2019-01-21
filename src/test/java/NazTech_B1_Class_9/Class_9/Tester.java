package NazTech_B1_Class_9.Class_9;

import Class_9.DAO.UserDAO;
import Class_9.Model.User;
import Class_9.Service.UserDAOImp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Tester {
	private UserDAO userDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userDAO = new UserDAOImp(); 
	}

	@Test
	public void testAddUser() {
		User u1=new User(101,"Sekh","sekh@gmail.com","01923012012");
		assertTrue(userDAO.addUser(u1));
		User u2=new User(102,"Mahadi","mahadi@gmail.com","01923928929");	
		assertTrue(userDAO.addUser(u2));
		User u3=new User(103,"Rupon","rupon@gmail.com","01755577746");	
		assertTrue(userDAO.addUser(u3));
	}

	@Test
	public void testUpadateUser() {
		testAddUser();
		User user=userDAO.get(1);
		user.setNAME("Sekh Mahadi");
		user.setEMAIL("sekh.mahadi@gmail.com");
		user.setPHONE("01923012012");
		assertEquals(true, userDAO.upadateUser(user));
	}

	@Test
	public void testDeleteUser() {
		testAddUser();
		User user=userDAO.get(1);
		assertEquals(true, userDAO.deleteUser(user));
		
	}

	@Test
	public void testGet() {
		testAddUser();
		User user=userDAO.get(1);
		assertEquals(user, userDAO.get(1));
	}

	@Test
	public void testListAll() {
		testAddUser();
		assertEquals("Something went wrong while fetching the list of products!",3, userDAO.listAll().size());
		
	}
}
