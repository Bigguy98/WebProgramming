<%-- 
    Document   : index
    Created on : Oct 28, 2019, 9:00:50 AM
    Author     : hoaiphat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="template/css/index.css">
    <link rel="stylesheet" href="template/fontawesome/css/all.css">

    <title>Index</title>
</head>
<body>
    <jsp:include page="/view/header.jsp"></jsp:include>

    <jsp:include page="/view/banner.jsp"></jsp:include>

	<div class="product">
		<div class="product-inner">
			<div class="title-product">
				<h1>Sản phẩm</h1>
				<hr class=line>
			</div>
			<div class="intro-product">
				<p>"Càng mua Càng rẻ" Chúng tôi không cố gắng để thuyết phục người dùng về điều chỉnh suy nghĩ của mình, mà đơn giản, đó chỉ là tìm cách tốt nhất để tiết kiệm tài chính phục vụ cho lợi ích của chính mình. Đó cũng chính là những gì chúng tôi cố gắng để đem đến cho người dùng một lời giới thiệu ý nghĩa nhất.</p>
			</div>
			<div class="list-product">
				<div class="item-product col-4 col-12 col-6">
					
					<div class="item-inner">
						<div class="item-img-cart">
							<div class="item-cart-info">
								<a href=""><i class="fas fa-cart-plus"></i></a>
							</div>
							<div class="item-img-info">
								<img src="template/images/iphone11-pro.jpg" alt="">
							</div>
						</div>
						<div class="item-info">
							<h2 class="price-product">30$</h2>
							<h2 class="name-product">Iphone11-pro</h2>
						</div>
					</div>
					
				</div>
				<div class="item-product col-4 col-12 col-6">
					
					<div class="item-inner">
						<div class="item-img-cart">
							<div class="item-cart-info">
								<a href=""><i class="fas fa-cart-plus"></i></a>
							</div>
							<div class="item-img-info">
								<img src="template/images/iphone11-pro.jpg" alt="">
							</div>
						</div>
						<div class="item-info">
							<h2 class="price-product">30$</h2>
							<h2 class="name-product">Iphone11-pro</h2>
						</div>
					</div>
					
				</div>
				<div class="item-product col-4 col-12 col-6">
					
					<div class="item-inner">
						<div class="item-img-cart">
							<div class="item-cart-info">
								<a href=""><i class="fas fa-cart-plus"></i></a>
							</div>
							<div class="item-img-info">
								<img src="template/images/iphone11-pro.jpg" alt="">
							</div>
						</div>
						<div class="item-info">
							<h2 class="price-product">30$</h2>
							<h2 class="name-product">Iphone11-pro</h2>
						</div>
					</div>
					
				</div>
				<div class="item-product col-4 col-12 col-6">
					
					<div class="item-inner">
						<div class="item-img-cart">
							<div class="item-cart-info">
								<a href=""><i class="fas fa-cart-plus"></i></a>
							</div>
							<div class="item-img-info">
								<img src="template/images/iphone11-pro.jpg" alt="">
							</div>
						</div>
						<div class="item-info">
							<h2 class="price-product">30$</h2>
							<h2 class="name-product">Iphone11-pro</h2>
						</div>
					</div>
					
				</div>
				<div class="item-product col-4 col-12 col-6">
					
					<div class="item-inner">
						<div class="item-img-cart">
							<div class="item-cart-info">
								<a href=""><i class="fas fa-cart-plus"></i></a>
							</div>
							<div class="item-img-info">
								<img src="template/images/iphone11-pro.jpg" alt="">
							</div>
						</div>
						<div class="item-info">
							<h2 class="price-product">30$</h2>
							<h2 class="name-product">Iphone11-pro</h2>
						</div>
					</div>
					
				</div>
			</div>
			<div class="extend">
				<a href="">
					<i class="fas fa-angle-double-down"></i>
				</a>
			</div>
		</div>
	</div>
    <jsp:include page="/view/footer.jsp" ></jsp:include>
    <script src="template\js\jquery.min.js" type="text/javascript"></script>
    <script src="template\js\index.js" type="text/javascript"></script>
</body>
</html>

