<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>reg.jsp</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function () {
			ready();
			$(".btnDelete").click(onClickBtn);
		});
		
		function ready(){
			$.ajax({
				url:"list.do", 
				type:"get",
				success:function(result){
					$("tbody").html(result)
				}
			});
		}
		function onClickBtn(){
			alert("버튼이 클릭되었어요")
		}
	</script>
</head>
<body>
	<h1>메모장</h1>
	<form action="reg.do" method="post">
		<input type="text" name="writer" placeholder="작성자"/>
		<input type="text" name="content" placeholder="내용입력"/>
		<button type="submit">등록</button>
	</form>
	<hr>
	<table>
		<thead>
			<tr>
				<td>no</td>
				<td>내용</td>
				<td>작성자</td>
				<td></td>
			</tr>
		</thead>
		<tbody>
			
		</tbody>
	</table>
	
</body>
</html>