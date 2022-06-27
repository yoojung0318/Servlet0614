<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>  
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘부터 1일</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
</head>
<body>

	<h1 class="font-weight-blod">오늘부터 1일</h1>
	<%
	Calendar today = Calendar.getInstance();

	//SimpleDateFormat  활용해서 Calendar 현재 날짜 출력
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
	String dateString = formatter.format(today.getTime());
	
	//100일 후 날짜 확인 -> +1000일 뒤 날짜로 date가 변경
	today.add(Calendar.DATE,100);
	
	dateString = formatter.format(today.getTime());
	out.println(dateString);
	int date = Integer.parseInt(dateString);
	
	for(int i = 0; i <1001; i++){
		if( i = 100){
			out.println("100일 : " + date);
		} else if(i = 200){
			out.println("200일 : " + date);
		}
		
	}
	%>

	
</body>
</html>