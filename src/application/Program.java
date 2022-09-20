package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department dp = new Department(1, "Books");
		System.out.println(dp);
		
		Seller s1 = new Seller(1, "João", "joao@email.com", sdf.parse("12/01/1999"), 3000.0, dp);
		System.out.println(s1);

	}

}
