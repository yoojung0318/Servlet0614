<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>    
<%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 기초</title>
</head>
<body>
	<h2>jsp 기초</h2>
	<!-- html 주석은 소스보기에서 보임 -->
	<%-- jsp 주석은 소스보기에서 안보임 --%>
	
	<%-- 1 부터 100까지의 합 구하고 결과 보여주기 --%>
	
	<%
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;	
		}
		
		// 자바코드로 출력하기
		// out.println("<h3>" + sum + "</h3>");   -> jsp에서 안좋은 방법
	%>	
		<h3> 합계 : <%= sum %> </h3>

		<%-- 리스트 사용하기 --%>
		
		<%
			//동물 이름 리스트
			List<String> animalList = new ArrayList<>();
			
			animalList.add("dog");
			animalList.add("cat");
			animalList.add("tiger");
		%>
		
		<h4> <%= animalList.get(0) %></h4>
		
		<input type="text" value=" <%=animalList.get(2) %>">
		
		<<%=animalList.get(1) %>> </<%=animalList.get(1) %>> 
		
		<%!
			public String getHelloWorld(){
				return "Hello World";
		}
		%>
		
		<%= getHelloWorld() %>
	
		
</body>
</html>