/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-17 13:48:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>宜立方商城后台管理系统</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }/layout/inc.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar index_tabs;\r\n");
      out.write("\tvar index_tabsMenu;\r\n");
      out.write("\tvar index_layout;\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tindex_layout = $('#index_layout').layout({\r\n");
      out.write("\t\t\tfit : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/*index_layout.layout('collapse', 'east');*/\r\n");
      out.write("\r\n");
      out.write("\t\tindex_tabs = $('#index_tabs')\r\n");
      out.write("\t\t\t\t.tabs(\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tfit : true,\r\n");
      out.write("\t\t\t\t\t\t\tborder : false,\r\n");
      out.write("\t\t\t\t\t\t\tonContextMenu : function(e, title) {\r\n");
      out.write("\t\t\t\t\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\t\t\t\t\tindex_tabsMenu.menu('show', {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tleft : e.pageX,\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttop : e.pageY\r\n");
      out.write("\t\t\t\t\t\t\t\t}).data('tabTitle', title);\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\ttools : [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'database_refresh',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar href = index_tabs.tabs(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'getSelected').panel(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'options').href;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (href) {/*说明tab是以href方式引入的目标页面*/\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar index = index_tabs\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.tabs(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'getTabIndex',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex_tabs\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.tabs('getSelected'));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tindex_tabs\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.tabs('getTab', index)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.panel('refresh');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {/*说明tab是以content方式引入的目标页面*/\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar panel = index_tabs.tabs(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t'getSelected').panel(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t'panel');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar frame = panel\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('iframe');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (frame.length > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor (var i = 0; i < frame.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tframe[i].contentWindow.document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.write('');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tframe[i].contentWindow\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.close();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tframe[i].src = frame[i].src;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (navigator.userAgent\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.indexOf(\"MSIE\") > 0) {// IE特有回收内存方法\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCollectGarbage();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'delete',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar index = index_tabs\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.tabs(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'getTabIndex',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex_tabs\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.tabs('getSelected'));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar tab = index_tabs.tabs('getTab',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindex);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (tab.panel('options').closable) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tindex_tabs.tabs('close', index);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$.messager\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.alert(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'提示',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'['\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ tab\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.panel('options').title\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ']不可以被关闭！',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'error');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tindex_tabsMenu = $('#index_tabsMenu').menu(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tonClick : function(item) {\r\n");
      out.write("\t\t\t\t\t\tvar curTabTitle = $(this).data('tabTitle');\r\n");
      out.write("\t\t\t\t\t\tvar type = $(item.target).attr('title');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif (type === 'refresh') {\r\n");
      out.write("\t\t\t\t\t\t\tindex_tabs.tabs('getTab', curTabTitle).panel(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'refresh');\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif (type === 'close') {\r\n");
      out.write("\t\t\t\t\t\t\tvar t = index_tabs.tabs('getTab', curTabTitle);\r\n");
      out.write("\t\t\t\t\t\t\tif (t.panel('options').closable) {\r\n");
      out.write("\t\t\t\t\t\t\t\tindex_tabs.tabs('close', curTabTitle);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar allTabs = index_tabs.tabs('tabs');\r\n");
      out.write("\t\t\t\t\t\tvar closeTabsTitle = [];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$.each(allTabs, function() {\r\n");
      out.write("\t\t\t\t\t\t\tvar opt = $(this).panel('options');\r\n");
      out.write("\t\t\t\t\t\t\tif (opt.closable && opt.title != curTabTitle\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&& type === 'closeOther') {\r\n");
      out.write("\t\t\t\t\t\t\t\tcloseTabsTitle.push(opt.title);\r\n");
      out.write("\t\t\t\t\t\t\t} else if (opt.closable && type === 'closeAll') {\r\n");
      out.write("\t\t\t\t\t\t\t\tcloseTabsTitle.push(opt.title);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < closeTabsTitle.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tindex_tabs.tabs('close', closeTabsTitle[i]);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"index_layout\">\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tdata-options=\"region:'north',href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layout/north.jsp'\"\r\n");
      out.write("\t\t\tstyle=\"height: 70px; overflow: hidden;\" class=\"logo\"></div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tdata-options=\"region:'west',href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layout/west.jsp',split:true\"\r\n");
      out.write("\t\t\ttitle=\"模块导航\" style=\"width: 200px; overflow: hidden;\"></div>\r\n");
      out.write("\t\t<div data-options=\"region:'center'\" title=\"欢迎使用E3\"\r\n");
      out.write("\t\t\tstyle=\"overflow: hidden;\">\r\n");
      out.write("\t\t\t<div id=\"index_tabs\" style=\"overflow: hidden;\">\r\n");
      out.write("\t\t\t\t<div title=\"首页\" data-options=\"border:false\"\r\n");
      out.write("\t\t\t\t\tstyle=\"overflow: hidden;\">\r\n");
      out.write("\t\t\t\t\t<iframe\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/portal/index.jsp?v=ssss\"\r\n");
      out.write("\t\t\t\t\t\tframeborder=\"0\" style=\"border: 0; width: 100%; height: 98%;\"></iframe>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tdata-options=\"region:'east',href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layout/east.jsp'\"\r\n");
      out.write("\t\t\ttitle=\"日历\" style=\"width: 230px; overflow: hidden;\"></div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tdata-options=\"region:'south',href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layout/south.jsp',border:false\"\r\n");
      out.write("\t\t\tstyle=\"height: 30px; overflow: hidden;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"index_tabsMenu\" style=\"width: 120px; display: none;\">\r\n");
      out.write("\t\t<div title=\"refresh\" data-options=\"iconCls:'transmit'\">刷新</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div title=\"close\" data-options=\"iconCls:'delete'\">关闭</div>\r\n");
      out.write("\t\t<div title=\"closeOther\" data-options=\"iconCls:'delete'\">关闭其他</div>\r\n");
      out.write("\t\t<div title=\"closeAll\" data-options=\"iconCls:'delete'\">关闭所有</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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