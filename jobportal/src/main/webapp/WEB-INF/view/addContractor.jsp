<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<section id="main-content">
<section class="wrapper">


	<h2> Contractor Register</h2>
		<form action="registerWorker" method="post">
		<div class="row">
		<div class="col-md-6">
		worker name	<input type="text" class="ggg" name="frstname" placeholder="frstname" required="">
		        	<input type="text" class="ggg" name="lastname" placeholder="lastname" required="">
		</div>
		
		<div class="col-md-3">
		Gender <select type="text" class="ggg" name="gender"required="">
					<option value="Female">Available</option>
					<option value="Male">Not-Available</option></select>
		</div>
		<div class="row">
		<div class="col-md-6">
		Birthdate	<input type="text" class="ggg" name="Birthdate" placeholder="Birthdate" required="">
		</div>
		
		</div>
		
		<div class="row">
		<div class="col-md-6">
		mail	<input type="text" class="ggg" name="mail" placeholder="mail" required="">
		</div>
		
		</div>
		<div class="row">
		<div class="col-md-6">
		Mobile	<input type="text" class="ggg" name="Mobile" placeholder="Mobile" required="">
		</div>
		
		</div>
		
		<div class="col-md-3">
		Gender <select type="text" class="ggg" name="gender"required="">
					<option value="Female">Available</option>
					<option value="Male">Not-Available</option></select>
		</div>
		
		<div class="row">
		<div class="col-md-6">
		Applied Date<input type="text" class="ggg" name="AppliedDate" placeholder="AppliedDate" required="">
		</div>
		
		
		</div>
		
		<div class="col-md-3">
		Status <select type="text" class="ggg" name="status"required="">
					<option value="Available">Available</option>
					<option value="Not-Available">Not-Available</option></select>
		</div>
	
 							</div>
		 <div class="row">
		
		<!-- <div class="col-md-6"> -->
		<div class="clearfix"></div>
				<div class="form-group col-md-6">
							<input class="btn-success btn-block large" type="submit"
								value="Proceed">
		</div>
		<div class="form-group col-md-6">
			<input class="btn-success btn-block large" type="reset"	value="Clear">
		</div>
		</div>
		</form>
		
</section>
</section>
</body>
</html>
