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
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>
				<table class="table">
					<thead class="table-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Product price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${products }" var="product">
							<tr>
								<th scope="row">TECHONLY${product.id }</th>
								<td>${product.prod_name }</td>
								<td>${product.prod_desc }</td>
								<td class="fw-bold">&#8377;${product.price }</td>
								<td><a href="delete/${product.id }"><i
										class="fa-solid fa-trash-can text-danger me-2"></i></a> <a
									href="update/${product.id }"> <i
										class="fa-solid fa-pen-nib text-primary ms-1"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="${pageContext.request.contextPath }/add-product"
						class="btn btn-outline-success">Add Product</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>