package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PrincipalCarousel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- JavaScript Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-bs-ride=\"false\">\n");
      out.write("            <div class=\"carousel-indicators\">\n");
      out.write("                \n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                \n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    \n");
      out.write("                  <img src=\"img/Foto1.jpg\" class=\"d-block w-100\" >\n");
      out.write("                  \n");
      out.write("                    <!-- \n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\n");
      out.write("                        <h5>First slide label</h5>\n");
      out.write("                        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    -->\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    \n");
      out.write("                  <img src=\"img/Foto2.jpg\" class=\"d-block w-100\" >\n");
      out.write("                    \n");
      out.write("                    <!-- \n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\n");
      out.write("                        <h5>Second slide label</h5>\n");
      out.write("                        <p>Some representative placeholder content for the second slide.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    \n");
      out.write("                  <img src=\"img/Foto3.jpg\" class=\"d-block w-100\" >\n");
      out.write("                  \n");
      out.write("                  <!-- \n");
      out.write("                  <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                      \n");
      out.write("                    <h5>Third slide label</h5>\n");
      out.write("                    <p>Some representative placeholder content for the third slide.</p>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                  -->\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("                \n");
      out.write("              <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("              <span class=\"visually-hidden\">Previous</span>\n");
      out.write("              \n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("                \n");
      out.write("              <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("              <span class=\"visually-hidden\">Next</span>\n");
      out.write("              \n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
