<%-- 
    Document   : product-detail
    Created on : Oct 28, 2019, 9:01:27 AM
    Author     : hoaiphat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
        <link rel="stylesheet" href="template/css/index.css">
	<link rel="stylesheet" href="template/css/product-detail.css">

	<script src="template\js\jquery.min.js"></script>

	<script src="template/js/index.js" type="text/javascript"></script>

	<link rel="stylesheet" href="template/fontawesome/css/all.css">
	<link rel="stylesheet" href="template/fontawesome/css/fontawesome.min.css">

	<title>Product-detail</title>
</head>
<body>
	<jsp:include page="/view/header.jsp"></jsp:include>
	<ol class="breadcrumb">
		<li>
			<a href="">Home</a>
		</li>
		<li>
			<a href="">Category</a>
		</li>
		<li class="active">iphone11-pro
		</li>
	</ol>

	<div class="a-product-detail">
		<div class="a-product-detail-inner">
			<div class="col-6 col-12 img-product">
				<div class="img-show">
					<img src="images/iphone11-pro.jpg" alt="">
				</div>
			</div>
			<div class="col-6 col-12 info-product">
				<div class="info-product_inner">
					<h4 class="name-product">Iphone_11_pro</h4>
					<h4 class="price-product">30$</h4>
					<div class="marketing-product">
						<ul class="detail">
							<li>
								"Bảo hành: Bảo hành chính hãng 12 tháng, lỗi 1 đổi 1.Bao xài đổi trả trong vòng 15 ngày đầu tiên"
							</li>
							<li>
								Giảm thêm 5% tới 300K qua VnPay QR code
							</li>
							<li>
								"Khuyến mại: Hỗ trợ trả góp 0% dành cho các chủ thẻ tín dụng VPBank, VIB và Shinhan Bank, Bảo hành 1 đổi 1 chính hãng 12 tháng"
							</li>
						</ul>
					</div>

					<div class="choose-color">
						<div class="label">Màu</div>
						<div class="select-a-color">
							<select name="" id="">
								<option>Chọn màu</option>
								<option>Xám</option>
								<option>Đen</option>
								<option>Đỏ</option>
							</select>
						</div>
					</div>

					<div class="quantity-product">
						<div class="label">Số lượng</div>
						<div class="quantity-product-inner">
							<div class="quantity">
								<input type="button" id="minus" value="-" onclick="minus_quantity_product()">
								<input type="number" id="values">
								<input type="button" id="add" value="+" onclick="add_quantity_product()">
							</div>
						</div>
					</div>
					<div class="add-product">
						<button type="submit"> Thêm</button>
					</div>
				</div>
			</div>

		</div>
	</div>
	<jsp:include page="/view/footer.jsp" ></jsp:include>
<!-- themsan pham -->
<script src="js/them-soluong-sanpham.js" type="text/javascript">	</script>
<!-- giam san pham -->
<script src="js/gian-soluong-sanpham.js"></script>
</body>
</html>
