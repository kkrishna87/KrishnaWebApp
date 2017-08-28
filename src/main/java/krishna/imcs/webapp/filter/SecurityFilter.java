package krishna.imcs.webapp.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class SecurityFilter implements Filter {
	final Logger logger = Logger.getLogger(SecurityFilter.class);
	private ServletContext context;

	public SecurityFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		Enumeration<String> params = req.getParameterNames();
		while (params.hasMoreElements()) {
			String name = params.nextElement();
			String value = request.getParameter(name);
			System.out.println("param data" + name + " " + value);
			this.context.log(req.getRemoteAddr() + "::Request Params::{" + name + "=" + value + "}");
			logger.info(req.getRemoteAddr() + "::Request Params::{" + name + "=" + value + "}");
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("Log filter initialized");
	}

}