package in.co.rays.project_3.test;

import java.util.Date;

import in.co.rays.project_3.dto.BankDTO;
import in.co.rays.project_3.model.BankModelHibImp;

public class BankModelTest {

	public static BankModelHibImp model= new BankModelHibImp();
	public static void main(String[] args)throws Exception {
	
		testAdd();
	}
	private static void testAdd()throws Exception {

		BankDTO dto = new BankDTO();
		
		dto.setName("Shubham");
		dto.setDob(new Date());
		dto.setAccountNumber("1234");
		dto.setAddress("Indore");
		
		model.add(dto);
	}
}
