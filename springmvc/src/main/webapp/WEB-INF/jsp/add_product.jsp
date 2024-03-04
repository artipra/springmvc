<%--
  Created by IntelliJ IDEA.
  User: Arti
  Date: 03-03-2024
  Time: 01:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="./base.jsp"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<div class="container mt-3">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="text-center mb-3">Fill the product details</h1>
            <form action="handle-product" method="post">

                    <div class="form-group">
                        <label for="Product Name">Product Name</label>
                        <input type="text" class="form-control"
                                id="name" name="name" placeholder="Enter Product detail">
                    </div>

                    <div class="form-group">
                        <label for="description">Product Description</label>
                        <textarea class="form-control"
                                  name="description"
                                  class="form-control" id="description" row="5" placeholder="Enter the product description"></textarea>
                    </div>

                <div class="form-group">
                    <label for="Price">Product Price</label>
                    <input type="text" class="form-control" id="price" name="price" placeholder="Enter Product Price">
                </div>
                <div class="container text-center">
                    <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
                    <button type="sumbit" class="btn btn-primary">Add</button>
                </div>

            </form>
        </div>
    </div>
</div>
</body>
</html>
