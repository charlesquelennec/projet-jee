package controllerservlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import modelbean.Parkingbean;

/**
 * Servlet implementation class parkingservlet
 */
@WebServlet("/parkingservlet")
public class parkingservlet extends HttpServlet {
  
	@Override
	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	      throws ServletException, IOException {
	    HttpSession session = request.getSession();
	    synchronized(session) {
	      Parkingbean parkingBean = 
	        (Parkingbean)session.getAttribute("nom");
	      if (parkingBean == null) {
	    	  parkingBean = new Parkingbean();
	        session.setAttribute("nom", parkingBean);
	      }
	      parkingBean.setNom(request.getParameter("nom"));
	      parkingBean.setPrix(request.getParameter("prix"));
	      parkingBean.setAdresse(request.getParameter("adresse"));
	      String address = "/Parking/showparking.jsp";
	      RequestDispatcher dispatcher =
	        request.getRequestDispatcher(address);
	      dispatcher.forward(request, response);
	    }
	  }
	}
