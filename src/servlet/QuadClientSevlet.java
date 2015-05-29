package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservice.QuadServiceProxy;

/**
 * Servlet implementation class QuadClientSevlet
 */
public class QuadClientSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuadClientSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));
		QuadServiceProxy qsp = new QuadServiceProxy();
		String res = qsp.getResults(a, b, c);
		String img = qsp.getPlotB64(a, b, c);
		
		request.setAttribute("res", res);
		request.setAttribute("img", img);
		
		request.getRequestDispatcher("/Formulario.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
