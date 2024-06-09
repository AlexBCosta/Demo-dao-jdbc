package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Programa2 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);

		System.out.println("=== Teste1 findById===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println(department);

	
	/*	System.out.println("=== Teste2 Insert===");
		Department department2 = new Department(null, "Fisco");
		departmentDao.insert(department2);
		System.out.println("Inserido id: " + department2.getId()); 
		
		System.out.println("=== Teste3 update===");
		Department department3 = new Department(7, "Literatura");
		departmentDao.update(department3);  */
		
		System.out.println("=== Teste4 delete===");
		System.out.println("\n Informe o id para excluir: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		

		System.out.println("=== Teste5 findAll===");
		List<Department> departments = departmentDao.findAll();
		for (Department dep : departments) {
			System.out.println(dep);
		}

	}

}
