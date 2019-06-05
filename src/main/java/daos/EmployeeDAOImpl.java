package daos;

import java.util.List;
import java.util.Queue;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import models.Employee;
import utilitis.EntityManagerUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public Employee insertEmployee(Employee employee) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		return employee;
	}

	@Override
	public Employee findEmployee(int id) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Employee employee = entityManager.find(Employee.class, id);
		entityManager.close();
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Query query = entityManager.createQuery("Select e from Employee e");
//		entityManager.createQuery("", Employee.class);
		List<Employee> employees = query.getResultList();
		entityManager.close();
		return employees;

	}

	@Override
	public void removeEmployee(int id) {

		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			entityManager.close();
		}

	}
}
