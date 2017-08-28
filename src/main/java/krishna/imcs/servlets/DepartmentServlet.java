
package krishna.imcs.servlets;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krishna.imcs.pojo.Employee;
import krishna.imcs.service.EmployeeService;



public class DepartmentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String deptId = req.getParameter("Department_Id");
		
		List<Employee> emps = new ArrayList<>();
		try {
			
			emps = new EmployeeService().getEmployees(Integer.parseInt(deptId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (emps.size()>0) {
			req.setAttribute("employees", emps);
			RequestDispatcher rd = req.getRequestDispatcher("/dept.jsp");
			rd.forward(req, resp);
		}
	}
}
