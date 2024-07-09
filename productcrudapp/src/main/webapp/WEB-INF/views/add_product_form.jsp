<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill The Product Details</h1>

				<form action="handle-product" method="post">

					<div class="form-group m-2">
						<label for="name" class="form-label">Product Name</label> <input
							type="text" class="form-control" id="name"
							aria-describedby="emailHelp" name="prod_name"
							placeholder="Enter the product name here" />
					</div>
					<div class="form-group m-2">
						<label for="description">Product Description</label>
						<textarea rows="5" class="form-control" name="prod_desc"
							id="description" placeholder="Enter the product description"></textarea>
					</div>
					<div class="form-group m-2">
						<label for="price">Product Price</label><input type="text"
							placeholder="Enter Product Price" name="price"
							class="form-control" id="price" />
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger m-2">Back</a>
						<button type="submit" class="btn btn-primary m-2">Add</button>
					</div>

				</form>

			</div>
		</div>
	</div>

</body>
</html>