package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Junior", "junin@gmail.com", new Date(), 5000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("=== TEST 6: seller update ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deletion completed");
		sc.close();
	}

}
