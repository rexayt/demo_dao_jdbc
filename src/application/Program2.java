package application;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department insert ===");
		Department newDepartment = new Department(null, "Teste");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== TEST 2: seller findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("=== TEST 3: Department update ===");
		department = departmentDao.findById(1);
		department.setName("IT");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
	}

}
