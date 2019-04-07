<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Spring Boot MongoDb</title>

 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>


<header class="top-header">
<div class="container">
<div class="row">
<div class="col-md-8">
<br/><br/>
     <ul>
       <li><a href='/insertdoctor'>Insert doctor</a></li>
        <li><a href='/showAllDoctors'>Show All Doctors</a></li>
         <li><a href='/showFullNameLikeRobert'>Show All 'Robert'</a></li>
         <li><a href='/deleteAllDoctors'>Delete All Doctors</a></li>
       </ul>
       </div>
       <div class="col-md-offset-4"></div>
       </div>
</div>
</header>
<section class="content">
<div class="container">
<h1>Home</h1>
</div>
</section>
</body>
</html>