<html lang="en">
<head>
<meta charset="UTF-8">
<title>Example of Bootstrap 3 Readonly Inputs</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
    .form-inline {
    	margin: 20px;
    }
</style>
</head>
<body>
    <form class="form-inline">
  <div class="form-group">
    <label for="exampleInputName2">Actual Temperature:</label>
    <input type="text" class="form-control" id="exampleInputName2" placeholder="23 (placeholder)" readonly="readonly">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail2">Wanted Temperature:</label>
    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
  </div>
  <button type="submit" class="btn btn-primary">Send invitation</button>
</form>
</body>
</html>                                	