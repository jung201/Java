<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입창</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f9;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1 {
	text-align: center;
	color: #333;
	margin-bottom: 20px;
}

.form-container {
	width: 400px;
	padding: 20px;
	background-color: #fff;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
}

table {
	width: 100%;
	margin: 0 auto;
}

td {
	padding: 10px 0;
}

.text_right {
	text-align: right;
	padding-right: 10px;
	color: #555;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin: 5px 0;
	border: 1px solid #ddd;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type="submit"], input[type="reset"] {
	padding: 10px 20px;
	margin-right: 10px;
	border: none;
	border-radius: 4px;
	background-color: #4CAF50;
	color: white;
	cursor: pointer;
	font-size: 16px;
	transition: background-color 0.3s;
}

input[type="reset"] {
	background-color: #f44336;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

input[type="reset"]:hover {
	background-color: #e53935;
}
</style>
</head>
<body>
	<div class="form-container">
		<h1>회원 가입창</h1>
		<form method="post" action="${contextPath}/member/addMember.do">
			<table>
				<tr>
					<td class="text_right">아이디</td>
					<td><input type="text" name="id" placeholder="아이디를 입력하세요"></td>
				</tr>
				<tr>
					<td class="text_right">비밀번호</td>
					<td><input type="password" name="pwd"
						placeholder="비밀번호를 입력하세요"></td>
				</tr>
				<tr>
					<td class="text_right">이름</td>
					<td><input type="text" name="name" placeholder="이름을 입력하세요"></td>
				</tr>
				<tr>
					<td class="text_right">이메일</td>
					<td><input type="text" name="email" placeholder="이메일을 입력하세요"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="가입하기"> <input
						type="reset" value="다시입력"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
