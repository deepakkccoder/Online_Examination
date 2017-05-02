<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="<c:url value='/resources/css/myStyle.css'></c:url>" rel="stylesheet">
<!-- Bootstrap -->
<link href="<c:url value = '/resources/css/bootstrap/dist/css/bootstrap.min.css'></c:url>" rel="stylesheet">
<!-- Font Awesome -->
<link href="<c:url value = '/resources/fonts/font-awesome/css/font-awesome.min.css'></c:url>" rel="stylesheet">

<!-- NProgress -->
<link href="<c:url value = '/resources/js/nprogress/nprogress.css'></c:url>" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<c:url value = '/resources/css/custom.min.css'></c:url>" rel="stylesheet">
<link href="<c:url value = '/resources/css/email.css'></c:url>" rel="stylesheet">
<link href="<c:url value = '/resources/css/coach.css'></c:url>" rel="stylesheet">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-user"></i> <span>Coach</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="add_student_detail.html">Add Student Detail</a></li>
					  <li><a href="list_student_detail.html">List of Student</a></li>
                    </ul>
                  </li>
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
			<form action="#" method="post">
			    <div id="email_to" class="form-group">
					<div class="row">
						<div class="col-sm-1"></div>
						<div class="col-sm-1">
							<label for="to" class="lab">To:</label>
						</div>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="to" name="to"/>
						</div>
					</div>
				</div>
				<div id="email_subject" class="form-group">
					<div class="row">
						<div class="col-sm-1"></div>
						<div class="col-sm-1">
							<label for="subject" class="lab">Subject:</label>
						</div>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="subject" name="subject"/>
						</div>
					</div>
				</div>
				<div id="email_message" class="form-group">
					<div class="row">
						<div class="col-sm-1"></div>
						<div class="col-sm-1">
							<label for="message" class="lab">Message:</label>
						</div>
						<div class="col-sm-9">
							<textarea rows="6" cols="50" class="form-control" id="message" name="message"></textarea>
						</div>
					</div>
				</div>
				<div>
					<div class="row">
					    <div class="col-sm-10"></div>
						<div class="col-sm-1">
							<button type="submit" id="submit" class="btn">Submit</button>
						</div>
						<div class="col-sm-1"></div>
					</div>
				</div>
			</form>
		</div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
              &copy; 2017 Maharishi University of Management. All rights reserved.
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>
    <!-- jQuery -->
    <script src='<spring:url value="resources/js/jquery/dist/jquery.min.js"></spring:url>'></script>
    <!-- Bootstrap -->
    <script src='<spring:url value="resources/css/bootstrap/dist/js/bootstrap.min.js"></spring:url>'></script>
    <!-- FastClick -->
    <script src='<spring:url value="resources/js/fastclick/lib/fastclick.js"></spring:url>'></script>
    <!-- NProgress -->
    <script src='<spring:url value="resources/js/nprogress/nprogress.js"></spring:url>'></script>

    <!-- Custom Theme Scripts -->
    <script src='<spring:url value="resources/js/custom.min.js"></spring:url>'></script>
    <script src='<spring:url value="resources/js/subcategory.js"></spring:url>'></script>
  </body>
</html>