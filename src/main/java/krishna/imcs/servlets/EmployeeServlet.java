package krishna.imcs.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krishna.imcs.pojo.Employee;
import krishna.imcs.service.EmployeeService;

public class EmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId = req.getParameter("Employee_Id");
		Employee emp=null;
		try {
			emp = new EmployeeService().getEmployee(Integer.parseInt(empId));
		} catch (NumberFormatException e) {
		   e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (emp != null) {
			req.setAttribute("emp", emp);
			RequestDispatcher rd = req.getRequestDispatcher("/emp.jsp");
			rd.forward(req, resp);
		}

	}
}
