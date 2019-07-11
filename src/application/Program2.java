package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Test 1: Department findById ====");
		Department department = departmentDao.findById(1);
		
		System.out.println(department);
		
		System.out.println("\n==== Test 2: Department findByAll ====");
		List<Department>list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n==== Test 3: Department insert ====");
		Department newDepartment = new Department(null,"Dança");
		departmentDao.insert(newDepartment);
		System.out.println("inserted! new Department = "+ newDepartment.getId());
		
		System.out.println("\n==== Test 4: Department update ====");
		department = departmentDao.findById(6);
		department.setName("Smartphone");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n==== Test 5: department delete ====");
		System.out.println("Entre com o id para deletar:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted completed");
		
		sc.close();
	}

}
