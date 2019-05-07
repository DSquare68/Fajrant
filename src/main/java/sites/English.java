package sites;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "English", urlPatterns = "/sites/languageSelect")
public class English extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
 
        String language = request.getParameter("language");
        String nbLessons = request.getParameter("number_of_lesson");
        String nbWords = request.getParameter("number_of_words");
        System.out.println(language+"  "+nbLessons+"  "+nbWords);
        /*try {
            double bmi = calculateBMI(
              Double.parseDouble(weight), 
              Double.parseDouble(height));
             
            request.setAttribute("bmi", bmi);
            response.setHeader("Test", "Success");
            response.setHeader("BMI", String.valueOf(bmi));
 
            RequestDispatcher dispatcher 
              = request.getRequestDispatcher("english.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("english.jsp");
        }*/
       
    }	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	
	}
}
