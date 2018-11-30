<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ありがとう画面</title>
</head>
<body>
<table>
<tr>
<th>id</th>
<th>text</th>
</tr>
<logic:iterate id ="textinfo" name="dbdata" scope="request">
<tr>
<td><bean:write name="textinfo" property="id" /></td>
<td><bean:write name="textinfo" property="text" /></td>
</tr>
</logic:iterate>
</table>
<% request.getAttribute("dbdata"); %>
<br>
<a href="http://localhost:8080/TaskProject/">入力画面に戻る</a>
</body>
</html>