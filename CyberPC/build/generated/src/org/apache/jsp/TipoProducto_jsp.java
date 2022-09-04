package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TipoProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css\">\r\n");
      out.write("        <link rel=stylesheet type=\"text/css\" href=\"css/styleCategorias.css\">\r\n");
      out.write("        \r\n");
      out.write("        <title>Tipo De Producto</title>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card col-sm-4\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    \r\n");
      out.write("                    <h2 class=\"text-center\">Categorías</h2>\r\n");
      out.write("                    <br><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                    <form action=\"Controlador?menu=TipoProducto\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            \r\n");
      out.write("                            <label>Marca:</label>\r\n");
      out.write("                            <input type=\"text\" name=\"txtMarca\" class=\"form-control\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            \r\n");
      out.write("                            <label>Descripción:</label>\r\n");
      out.write("                            <input type=\"text\" name=\"txtDescripcion\" class=\"form-control\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <button type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"bi bi-person-plus-fill btn btn-info\"> Agregar</button>\r\n");
      out.write("                        <button type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"bi bi-person-check-fill btn btn-success\"> Actualizar</button>\r\n");
      out.write("                        \r\n");
      out.write("                        <!-- <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"bi bi-person-plus-fill btn btn-info\"> -->\r\n");
      out.write("                        <!-- <input type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn btn-success\"> -->\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-sm-8\" style=\"background-color: #F5F5F5\">\r\n");
      out.write("                <table class=\"table table-hover table-bordered table-hove\" style=\"border: black 2.5px solid; background-color: #E5E5E5\"> \r\n");
      out.write("                    \r\n");
      out.write("                    <thead>\r\n");
      out.write("                        \r\n");
      out.write("                    <br>\r\n");
      out.write("                        \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <td style=\"border: black 2.5px solid; font-weight: bold\" class=\"table-primary text-center\">CÓDIGO</td>\r\n");
      out.write("                            <td style=\"border: black 2.5px solid; font-weight: bold\" class=\"table-primary text-center\">MARCA</td>\r\n");
      out.write("                            <td style=\"border: black 2.5px solid; font-weight: bold\" class=\"table-primary text-center\">DESCRIPCIÓN</td>\r\n");
      out.write("                            <td style=\"border: black 2.5px solid; font-weight: bold\" class=\"table-primary text-center\">ACCIONES</td>\r\n");
      out.write("                            \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                    </thead>\r\n");
      out.write("                    \r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("tipoProducto");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoProductos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        \r\n");
          out.write("                        <tr>\r\n");
          out.write("                            \r\n");
          out.write("                            <td class=\"text-center table-light\" style=\"border: 1.5px solid\"  >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoProducto.getCodigoTipoProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"text-center table-light\" style=\"border: 1.5px solid\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoProducto.getCodigoMarca()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"text-center table-light\" style=\"border: 1.5px solid\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoProducto.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("                            <td class=\"text-center table-light\" style=\"border: 1.5px solid\">\r\n");
          out.write("                                \r\n");
          out.write("                                <a class=\"btn btn-warning bi bi-pencil-fill\" href=\"\"> Editar</a>\r\n");
          out.write("                                <a class=\"btn btn-danger bi bi-trash-fill\" href=\"\"> Eliminar</a>\r\n");
          out.write("                                \r\n");
          out.write("                            </td>\r\n");
          out.write("                            \r\n");
          out.write("                        </tr>\r\n");
          out.write("                        \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}