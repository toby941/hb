/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2013-04-17 09:44:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gulf.Init;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  .form-signin {\r\n");
      out.write("        max-width: 300px;\r\n");
      out.write("        padding: 19px 29px 29px;\r\n");
      out.write("        margin: 0 auto 20px;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        border: 1px solid #e5e5e5;\r\n");
      out.write("        -webkit-border-radius: 5px;\r\n");
      out.write("           -moz-border-radius: 5px;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("                box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin .form-signin-heading,\r\n");
      out.write("      .form-signin .checkbox {\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin input[type=\"text\"],\r\n");
      out.write("      .form-signin input[type=\"password\"] {\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        margin-bottom: 15px;\r\n");
      out.write("        padding: 7px 9px;\r\n");
      out.write("      }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"tabbable form-signin\">\r\n");
      out.write("  <ul class=\"nav nav-tabs\">\r\n");
      out.write("    <li class=\"active\"><a href=\"#1\" data-toggle=\"tab\">登陆</a></li>\r\n");
      out.write("    <li><a href=\"#2\" data-toggle=\"tab\">首次访问</a></li>\r\n");
      out.write("     <li><a href=\"#2\" data-toggle=\"tab\">用人单位信息注册</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <div class=\"tab-content\">\r\n");
      out.write("    <div class=\"tab-pane active\" id=\"1\">\r\n");
      out.write("       <form  action=\"/admin/login\" method=\"post\">\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"input01\">学号</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t  <input type=\"text\" class=\"input-block-level\" placeholder=\"用户名\" id=\"username\" name=\"username\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"input01\">密码</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t <input type=\"password\" class=\"input-block-level\" placeholder=\"口令\" id=\"password\" name=\"password\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        <button class=\"btn btn-large btn-primary\" type=\"submit\">登录</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"tab-pane\" id=\"2\">\r\n");
      out.write("     <div class=\"tab-content\">\r\n");
      out.write("    <div class=\"tab-pane active\" id=\"1\">\r\n");
      out.write("       <form  action=\"/admin/login\" method=\"post\">\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"input01\">身份证号码</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t  <input type=\"text\" class=\"input-block-level\" placeholder=\"用户名\" id=\"username\" name=\"username\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"input01\">学号</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t <input type=\"password\" class=\"input-block-level\" placeholder=\"口令\" id=\"password\" name=\"password\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        <button class=\"btn btn-large btn-primary\" type=\"submit\">登录</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"tab-pane\" id=\"3\">\r\n");
      out.write("     <div class=\"tab-content\">\r\n");
      out.write("    <div class=\"tab-pane active\" id=\"1\">\r\n");
      out.write("       <form  action=\"/admin/login\" method=\"post\">\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"input01\">身份证号码</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t  <input type=\"text\" class=\"input-block-level\" placeholder=\"用户名\" id=\"username\" name=\"username\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"input01\">学号</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t <input type=\"password\" class=\"input-block-level\" placeholder=\"口令\" id=\"password\" name=\"password\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        <button class=\"btn btn-large btn-primary\" type=\"submit\">登录</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
