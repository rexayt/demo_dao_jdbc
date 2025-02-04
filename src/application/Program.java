package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Jorge", "Jorge@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);

	}

}
