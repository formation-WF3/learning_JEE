package com.formation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class IndexController
 */
@WebServlet(urlPatterns = "/",
			initParams = {
					@WebInitParam(name = "name", value = "visiteur")
			}
)
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get index");
		
		String name = request.getParameter("name");
		
		if (name == null || name.isEmpty()) {
			name = this.getServletConfig().getInitParameter("name");
		}
		
		// Servlet => jsp
		request.setAttribute("nom", name.toUpperCase());		
		
//		response.getWriter()
//			.append("Bienvenue ")
//			.append(name == null ? "visiteur" : name);
		this.getServletContext()
			.getRequestDispatcher("/WEB-INF/index.jsp")
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = request.getParameter("prenom");
		System.out.println(prenom);
		
		request.setAttribute("nom", prenom.toUpperCase());		
		
		this.getServletContext()
			.getRequestDispatcher("/WEB-INF/index.jsp")
			.forward(request, response);
		// doGet(request, response);
	}

}
