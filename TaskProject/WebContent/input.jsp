<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テキスト入力画面</title>
</head>
<body>
<html:form action="/ForText">
<html:text property="text"/>
<html:submit property="submit" value="next"/>
</html:form>
</body>
</html>