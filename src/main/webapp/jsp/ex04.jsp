<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>  
<%@ page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>

	<%
		//객체를 직접 생성하는게 아니라, 만들어진 객체를 사용함
		Calendar today = Calendar.getInstance();
		out.println(today);
	
		//SimpleDateFormat  활용해서 Calendar 현재 날짜 출력
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String dateString = formatter.format(today.getTime());
		
		out.println(dateString);
		
		//10일 후 날짜 확인 -> +10일 뒤 날짜로 date가 변경
		//today.add(Calendar.DATE, 10);
		//today.add(Calendar.DATE, -25);
		//today.add(Calendar.MONTH, -25);
		today.add(Calendar.YEAR,5);
		
		dateString = formatter.format(today.getTime());
		out.println(dateString);

		// 두 날짜 비교
		
		Calendar newCal = Calendar.getInstance();
		
		//크다, 작다, 같다
		//왼쪽의 객체가 오른쪽 객체보다 크면, 1
		//왼쪽의객체가 오른쪽 객체보다 작으면, -1
		// 같으면 0
		// taday - newCal 
		//  > 0 , = 0 ,< 0  으로 비교  -> compareTo 사용
		int result = today.compareTo(newCal);
		
		if(result > 0 ){
			out.println("todat가 더 크다");
		} else if(result < 0){
			out.println("newCal이 더 크다");
		}
		else{
			out.println("같다");		
		}	
		
		%>
</body>
</html>