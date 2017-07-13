<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" >
<script type="text/javascript" src="${pageContext.request.contextPath}/static/script/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/script/main.js"></script>
<title>Virtual Board</title>

<script type="text/javascript">
$(document).ready(goAherd());
</script>

</head>
<body>
	<div class="top-menu">
		
		<div class="top-menu-username">
			<c:out value="${user.name}"></c:out>
		</div>
		
		<img class="avatar_img" src="${pageContext.request.contextPath}/static/images/avatar.png"/>
	</div>
	<table class="board">
		<tr>
			<c:forEach var="column" items="${board.columns}">
				<th class="board-header"><c:out value="${column.name}"></c:out></th>
			</c:forEach>
		</tr>
		<tr>
			<c:forEach var="column" items="${board.columns}">
				<td id="${column.id}" class="board-column">		
					<c:forEach var="card" items="${cards}">
						<c:choose>
							<c:when test="${card.columnId == column.id}">
								<div class="card">
									<div class="card-context">
										<c:out value="${card.id}"></c:out>
										<c:out value="${card.title}"></c:out>
										<c:out value="${card.description}"></c:out>
									</div>
								</div>	
							</c:when>
							<c:otherwise></c:otherwise>
						</c:choose>					
					</c:forEach>
				</td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>