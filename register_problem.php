<?php
  $con = mysqli_connect("local_host","jkey20","wndltlr9557!","jkey20");

  $field = $_POST["field"];
  $name = $_POST["name"];

  $statememt = mysqli_prepare($con,"INSERT INTO USER VALUES(?,?)");
  mysqli_stmt_bind_param($statememt,"ss",$field,$name)

  $response = array();
  $response["success"] = true;

  echo json_encode($response);
?>
