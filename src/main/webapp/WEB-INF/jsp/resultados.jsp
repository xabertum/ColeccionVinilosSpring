<!doctype html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html class="no-js" lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>ColeccionVinilos2019 WebApp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/png" href="<%out.print(getServletContext().getContextPath());%>/assets/images/icon/discogs-vinyl-record-mark_64.png">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/font-awesome.min.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/themify-icons.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/metisMenu.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/owl.carousel.min.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/slicknav.min.css">

	<!-- amchart css -->
<link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />

<!-- others css -->
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/typography.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/default-css.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/styles.css">
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/assets/css/responsive.css">

	<!-- modernizr css -->
<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/vendor/modernizr-2.8.3.min.js"></script>

<!-- custom css -->
<link rel="stylesheet" href="<%out.print(getServletContext().getContextPath());%>/css_app/view/estilos.css">
</head>

<body>
	<!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
	<!-- preloader area start -->
	<div id="preloader">
		<div class="loader"></div>
	</div>
	<!-- preloader area end -->
	<!-- page container area start -->
	<div class="page-container">
		<!-- sidebar menu area start -->
		<div class="sidebar-menu">
			<div class="sidebar-header">
				<h6 class="text-center" style="color: aliceblue">
					<strong>ColeccionVinilos 2019</strong>
				</h6>
			</div>
			<div class="main-menu">
				<div class="menu-inner">
					<nav>
						<ul class="metismenu" id="menu">
							<li>
								<a href="/">
									<i class="fa fa-home"></i>
									<span>Inicio</span>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<i class="fa fa-tag"></i>
									<span>Mantenimientos</span>
								</a>
								<ul class="collapse">
									<li>
										<a href="<%out.print(getServletContext().getContextPath());%>/vinilos">
											<i class="fa fa-cubes"></i>
											<span>Vinilos</span>
										</a>
									</li>
									<li>
										<a href="">
											<i class="fa fa-archive"></i>
											<span>Productos</span>
										</a>
									</li>
								</ul>
							</li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
		<!-- sidebar menu area end -->
		<!-- main content area start -->
		<div class="main-content">
			<!-- header area start -->
			<div class="header-area">
				<div class="row align-items-center">
					<!-- nav and search button -->
					<div class="col-4 clearfix">
						<div class="nav-btn pull-left" style="margin-top: 0px">
							<span></span>
							<span></span>
							<span></span>
						</div>
					</div>
					<!-- profile info & task notification -->
					<div class="col-8 clearfix">
						<ul class="notification-area pull-right">
							<li>
								<a href="">
									Cerrar Sesi�n
									<i class="fa fa-sign-out" aria-hidden="true"></i>
								</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!-- header area end -->
			<div class="main-content-inner">
				<div class="row padding-top">
					<div class="col-12 text-uppercase">
						<a href="/">
							Inicio /
							<a href="/vinilos">Vinilos / </a>
							<a href="#">Fecha Edici�n</a>
						</a>
					</div>
				</div>
				<div class="row padding-top">
					<div class="col-12">
						<div class="card">
							<div class="card-body">
								<h6>FILTRADO:</h6>
								<form action="/vinilos/fechaEdicion" id="formCategoria" method="POST">
									<div class="row mt-3">
										<div class="form-group col-sm-11 col-12">
											<input type="text" id="fechaEdicion" name="fechaEdicion" class="form-control form-control-sm" placeholder="FECHA EDICION">
										</div>
										<div class="col-sm-1 col-12">
											<button type="submit" id="btnBuscarCategoria" class="btn btn-primary btn-xs">
												<i class="fa fa-search padding-right" aria-hidden="true"></i>
												BUSCAR
											</button>
										</div>

									</div>
								</form>
								<div class="row">
									<div class="col-12">
										<div class="table-responsive">
											<table class="table table-hover table-bordered">
												<thead class="bg-primary">
													<tr class="text-white">
														<th>ID</th>
														<th>NUM CATALOGO</th>
														<th>TITULO</th>
														<th>FECHA EDICION</th>
														<th>SELLO</th>
														<th>LUGAR COMPRA</th>
														<th>PRECIO</th>
														<th>FECHA COMPRA</th>

													</tr>
												</thead>
												<tbody id="tbodyCategoria">
													<c:forEach var="fecha" items="${fechaEdicion}">
														<tr>
															<td>${fecha.ID}</td>
															<td>${fecha.numCatalogo}</td>
															<td>${fecha.tituloVinilo}</td>
															<td>${fecha.fechaEdicion}</td>
															<td>${fecha.sello}</td>
															<td>${fecha.lugarCompra}</td>
															<td>${fecha.precio}</td>
															<td>${fecha.fechaCompra}</td>
														</tr>
													</c:forEach>

												</tbody>

											</table>
										</div>

									</div>
								</div>
							</div>
						</div>

					</div>
				</div>


			</div>
		</div>
		<!-- main content area end -->
		<!-- footer area start-->
		<footer>
			<div class="footer-area">
				<p>
					� Copyright 2019 -
					<a href="https://github.com/xabertum">xabertum</a>
				</p>
			</div>
		</footer>
		<!-- footer area end-->
	</div>
	<!-- page container area end -->
	<!-- jquery latest version -->
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/vendor/jquery-2.2.4.min.js"></script>
	<!-- bootstrap 4 js -->
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/popper.min.js"></script>
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/bootstrap.min.js"></script>
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/owl.carousel.min.js"></script>
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/metisMenu.min.js"></script>
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/jquery.slimscroll.min.js"></script>
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/jquery.slicknav.min.js"></script>

	<!-- start chart js -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
	<!-- start highcharts js -->
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<!-- start zingchart js -->
	<script src="https://cdn.zingchart.com/zingchart.min.js"></script>
	<script>
		zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
		ZC.LICENSE = [ "569d52cefae586f634c54f86dc99e6a9",
				"ee6b7db5b51705a13dc2339db3edaf6d" ];
	</script>
	<!-- all line chart activation -->
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/line-chart.js"></script>
	<!-- all pie chart -->
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/pie-chart.js"></script>
	<!-- others plugins -->
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/plugins.js"></script>
	<script src="<%out.print(getServletContext().getContextPath());%>/assets/js/scripts.js"></script>
</body>

</html>