/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-11-09 10:17:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<!-- <-- JavaScript Bundle with Popper -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".container-fluid {\r\n");
      out.write("	display: flex !important;\r\n");
      out.write("	justify-content: flex-start !important;\r\n");
      out.write("	margin: 3rem 0 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row \">\r\n");
      out.write("			<div class=\"col col-md-5\">\r\n");
      out.write("				<form action=\"addStudent\"\r\n");
      out.write("					class=\"border border-dark bg-dark text-light p-4 rounded\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<p class=\"h1 text-center bg-dark text-light p-2 pb-3 mt-2 rounded\">Registreation\r\n");
      out.write("							Form</p>\r\n");
      out.write("						<span class=\"text-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${add}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span> <span\r\n");
      out.write("							class=\"text-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${updateMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span> <span\r\n");
      out.write("							class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("						<div class=\"col\" onkeyup=\"validation()\">\r\n");
      out.write("							<input type=\"hidden\" name=\"uid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("							<label for=\"fname\" class=\"form-label\">Firstname :</label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" name=\"fname\" id=\"fname\"\r\n");
      out.write("								placeholder=\"Enter First Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getFname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("								required=\"required\"> <span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fnameError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<label for=\"lname\" class=\"form-label\">LastName : </label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" id=\"lname\" name=\"lname\"\r\n");
      out.write("								placeholder=\"Enter Last Name \" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getLname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("								required=\"required\"> <span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lnameError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<br />\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<label for=\"email\" class=\"form-label\">Email : </label>\r\n");
      out.write("							<div class=\"input-group\">\r\n");
      out.write("								<input type=\"text\" name=\"email\" id=\"email\"\r\n");
      out.write("									placeholder=\"Enter Email Hear\" class=\"form-control\"\r\n");
      out.write("									value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getEmail()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<br>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("\r\n");
      out.write("							<label for=\"pass\" class=\"form-label\">Password : </label> <input\r\n");
      out.write("								type=\"text\" id=\"pass\" name=\"password\" class=\"form-control\"\r\n");
      out.write("								placeholder=\"Enter Password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getPassword()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("								required=\"required\"> <span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${passError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<label for=\"number\" class=\"form-label\">number : </label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" id=\"number\" name=\"number\"\r\n");
      out.write("								placeholder=\"Enter mobile Number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getNumber()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("								required=\"required\"> <span class=\"text-danger\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<br /> <label for=\"gender\" class=\"from-label\">Gender</label>\r\n");
      out.write("					<div class=\"form-checked\">\r\n");
      out.write("						<input type=\"radio\" class=\"form-check-input\" name=\"gender\"\r\n");
      out.write("							id=\"gender\" value=\"male\" checked=\"checked\" /> &nbsp; Male <br />\r\n");
      out.write("						<input type=\"radio\" class=\"form-check-input\" name=\"gender\"\r\n");
      out.write("							id=\"gender\" value=\"female\" />&nbsp; &nbsp;Female\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<br> <label for=\"city\" class=\"form-label\">City</label> <select\r\n");
      out.write("						name=\"city\" id=\"\" class=\"form-select\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allData.getCity()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						<option value=\"Amreli\">Amreli</option>\r\n");
      out.write("						<option value=\"Surat\">Surat</option>\r\n");
      out.write("						<option value=\"Ahamdabad\">Ahamdabad</option>\r\n");
      out.write("						<option value=\"Baroda\">Baroda</option>\r\n");
      out.write("					</select> <br> <br>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"text-center mt-5\">\r\n");
      out.write("						<input type=\"submit\" value=\"Submit\" name=\"\" id=\"\"\r\n");
      out.write("							class=\"btn btn-success\"> <input type=\"reset\"\r\n");
      out.write("							value=\"Reset\" class=\"btn btn-warning\"> <a href=\"viewData\"\r\n");
      out.write("							class=\"btn btn-primary\">ViewData</a>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
