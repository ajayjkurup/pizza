<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login | E-Shopper</title>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/price-range.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/animate.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->


	
	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
			
				
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>edit item ${item.name} </h2>
							<form action="edit-${id}-item" method="POST">
								<input type="text" name="name" placeholder="name" value="${item.name}"/>
							<select name="type" style="margin-bottom:10px;">
                                 <option value="vegpizza"> Veg Pizza</option>
                                 <option value="nonvegpizza">Non Veg Pizza</option>
                                 <option value="bevereges">Beverages</option>
                                 <option value="topings">toppings</option>
                             </select>
							<input type="text" name="price" placeholder="price" value="${item.price}"/>
							<textarea  placeholder="description" name="description" style="margin-bottom:10px;">${item.description}</textarea>
							<input type="file" name="filename"/>
							<button type="submit" class="btn btn-default">add</button>
						</form>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
	
	
    <script src="${pageContext.request.contextPath}/resources/js/jquery.scrollUp.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.prettyPhoto.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>

</html>