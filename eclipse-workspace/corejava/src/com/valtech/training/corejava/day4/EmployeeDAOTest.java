package com.valtech.training.corejava.day4;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {
//	@Test 
//	public void testUpdateEmployee() throws Exception {
//		EmployeeDAO dao=new EmployeeDAO();
//		dao.updateEmployee(new Employee(3,"New Three",25,1,121212));
//		Employee e=dao.getEmployee(3);
//		assertEquals(e.getId(),3);
//		assertEquals(e.getName(),"New Three");
//		assertEquals(25,e.getAge());
//		assertEquals(1,e.getGender());
//		assertEquals(121212,e.getSalary(),0.0000001);
//		
//		
//	}
	
	
	
	@Test
	public void testGetEmployeesByage() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByAge(25);
		assertEquals(0,e.size());
		
	}
	
	
	
	@Test
	public void testGetEmployeesByMale() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByMale(1);
		assertEquals(3,e.size());
		
	}
	
	@Test
	public void testGetEmployeesByFemale() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByMale(2);
		assertEquals(2,e.size());
		
	}
	
	
	@Test
	public void testGetEmployeesByOthers() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByMale(3);
		assertEquals(3,e.size());
		
	}
	@Test
	public void testGetEmployeesByAgeBetween() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByAgeBetween(19,28);
		assertEquals(1,e.size());
		
	}
	@Test
	public void testGetEmployeesBySalaryGreaterThan() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeBySalaryGreaterThan(6000);
		assertEquals(8,e.size());
		
	}
	
	@Test
	public void testGetEmployeesBySalaryLessThan() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeBySalaryLessThan(6000);
		assertEquals(0,e.size());
		
	}
	
	
//	@Test
//	public void testGetEmployees() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		assertEquals(dao.count(),dao.getEmployees().size());
//		
//	}
	
	
	@Test
public void testGetEmployeeById() throws Exception {
        
        
        EmployeeDAO dao =new EmployeeDAO();
        Employee e=dao.getEmployeeById(1);
        
        
        assertEquals(1, e.getId());
        assertEquals(30, e.getAge());
//        assertEquals(1, e.getGender());
//        assertEquals("abc", e.getName());
        
       }
//
//	@Test
//	public void testSaveEmployee() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		int count=dao.count();
//		dao.saveEmployee(new Employee(4,"Four",27,0,10000));
//		assertEquals(count+1,dao.count());
//		dao.deleteEmployee(4);
//		assertEquals(count,dao.count());
//		//assertEquals(2,dao.count());
//		//System.out.println(dao.count());
//		//Connection conn=dao.getConnection();
//		//conn.close();
//	}

}
