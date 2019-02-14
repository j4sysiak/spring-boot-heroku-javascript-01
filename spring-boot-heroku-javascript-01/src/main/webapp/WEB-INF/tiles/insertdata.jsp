<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:url var="insertuser" value="/insertuser" />
<c:url var="insertstatus" value="/insertstatus" />

<form:form method="post" action="${insertuser}" >
	<button type="submit">Insert User</button>
</form:form>
<p>
<form:form method="post" action="${insertstatus}" >
	<button  type="submit">Insert Status</button>
</form:form>
