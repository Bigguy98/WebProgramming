<%-- 
    Document   : shop-cart
    Created on : Oct 28, 2019, 9:01:56 AM
    Author     : hoaiphat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
        
	<link rel="stylesheet" href="template/css/index.css">
        
	<link rel="stylesheet" href="template/css/shop-cart.css">

	<script src="template\js\jquery.min.js"></script>

	<script src="template\js\index.js" type="text/javascript"></script>

	<link rel="stylesheet" href="template/fontawesome/css/all.css">
	
	<title>Shop-cart</title>
</head>
<body>
	<jsp:include page="/view/header.jsp" ></jsp:include>
	<ol class="breadcrumb">
		<li>
			<a href="">Home</a>
		</li>
		<li class="active">Shop-cart
		</li>
	</ol>
	
	<div class="order">
		<div class="order-inner">
			<div class="col-9 col-12 product">
				<table class="table-shopping-cart">
					<tbody>
						<tr class="table-header">
							<th class="column-1">product</th>
							<th class="column-2"></th>
							<th class="column-3">price</th>
							<th class="column-4">quantity</th>
							<th class="column-5">total</th>
						</tr>
						<tr class="table-row">
							<td class="column-1">
								<div class="img-product">
									<img src="images/iphone11-pro.jpg" alt="">
								</div>
							</td>
							<td class="column-2">Iphone-11-pro</td>
							<td class="column-3">30<span>$</span></td>
							<td class="column-4">
								<div class="quantity-product">
									<input type="button" id="minus" value="-" onclick="minus_quantity_product()">
									<input type="number" id="">
									<input type="button" id="add" value="+"  onclick="add_quantity_product()">
								</div>
							</td>
							<td class="column-5"></td>
						</tr>
						<tr class="table-row">
							<td class="column-1">
								<div class="img-product"></div>
							</td>
							<td class="column-2">Iphone-11-pro</td>
							<td class="column-3">30$</td>
							<td>
								<div class="quantity-product">
									<input type="button" id="minus" value="-" onclick="minus_quantity_product()">
									<input type="number" id="values">
									<input type="button" id="add" value="+"  onclick="add_quantity_product()">
								</div>
							</td>
							<td class="column-4"></td>
						</tr>
					</tbody>
				</table>
				<div class="update-cart">
					<button class="update">Cập nhật</button>
				</div>
			</div>
			<div class="col-3 col-12 info-customer">
				<h4 class="text">
					Cart Totals
				</h4>
				<div class="total flex-w">
					<div class="flex-3 title">
						Subtotal:
					</div>
					<div class="flex-7 price">
						$30
					</div>
				</div>
				<div class="shipping flex-w">
					<div class="flex-3 title">
						Shipping:
					</div>
					<div class="flex-7 address-customer">
						<p class="annoucement">Ship will take 3 to 5 days</p>
						<div class="address">
							<input type="text" id="city" placeholder="City">
							<input type="text" id="street" placeholder="Street">
							<input type="text" id="no" placeholder="No">
						</div>
					</div>
				</div >
				<div class="flex-w total-price">
					<div class="flex-3 title">
						Total:
					</div>
					<div class="flex-7 price-total">
						$79.65
					</div>
				</div>
				<button class="btn-order">Chấp nhận</button>
			</div>
		</div>
	</div>
	<jsp:include page="/view/footer.jsp" ></jsp:include>
	<script src="js/gian-soluong-sanpham.js" type="text/javascript"></script>
	<script src="js/them-soluong-sanpham.js" type="text/javascript"></script>
</body>
</html>