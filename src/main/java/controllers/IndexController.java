package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.EmployeeService;
import services.EmployeeServiceImpl;
import models.Employee;

@WebServlet("")
public class IndexController extends HttpServlet {
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	private static final long serialVersionUID = 1L;

	private final EmployeeService employeeService = new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// String employeeName = req.getParameter("name");
		// String employeeSurname = req.getParameter("surname");
		// int employeeSalary = Integer.parseInt(req.getParameter("salary"));
		//
		// Employee employee = new Employee(employeeName, employeeSurname,
		// employeeSalary);
		// employeeService.insertEmployee(employee);
		//
		// List<Employee> allEmployees = employeeService.findAllEmployees();
		// req.setAttribute("allEmployees", allEmployees);
		// RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		// dispatcher.forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		LOGGER.info("Goto /IndexController controller");

		//
		// if (req.getParameter("employeeId") != null)
		// {
		// int employeeId = Integer.parseInt(req.getParameter("employeeId"));
		// employeeService.removeEmployee(employeeId);
		// }
		//
		// List<Employee> allEmployees = employeeService.findAllEmployees();
		// req.setAttribute("allEmployees", allEmployees);
		// RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		// dispatcher.forward(req, resp);

		// return "Hello World";

		// set response headers
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter writer = response.getWriter();

		writer.append("<p>Hello World</p>");

		writer.append("<a href='/gaix/employeeController'>Click here</a> go to Demo page");

	}

}
