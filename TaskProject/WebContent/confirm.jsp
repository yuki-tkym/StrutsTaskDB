<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力内容確認画面</title>
</head>

<body>

<%

 String tvalue = (String)request.getAttribute("text");

%>


<h3>入力内容</h3>
<bean:write name="ForText" property="text"
            scope="request" ignore="true" />
<br>
<html:form action="/RegText">
<html:hidden property="text" value="<%= tvalue %>" />
<html:submit property="submit" value="next"/>
</html:form>
<br>
<a href="http://localhost:8080/TaskProject/">入力画面に戻る</a>

</body>

</html>