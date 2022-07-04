<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="d-flex">
			<div class="Logo col-3  d-flex align-items-center">
				<h1 class=" text-success">Melong</h1>
			</div>
			<form method="get" action="/jspTemplete/test02/test02_02.jsp">
				<div class="search col-9 d-flex align-item-center">
					<div class="input-group mb-3 col-7">
						<!--  test02_02에서 생성한 파라미터인title을 name에 적용 -->
					  <input type="text" class="form-control" name="title">
					  <div class="input-group-append">
					    <button class="btn btn-success" type="button">검색</button>
	 				  </div>
	 				</div> 
				</div>
			</form>
		</header>