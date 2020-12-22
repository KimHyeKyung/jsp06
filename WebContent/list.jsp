<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.no}</td>
		<td>${dto.content}</td>
		<td>${dto.writer}</td>
		<td><button type="button" class="btnDelete" >삭제</button></td>
	</tr>

</c:forEach>
