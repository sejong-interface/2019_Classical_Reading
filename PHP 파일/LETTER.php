<?php
	$con = mysqli_connect("localhost","jkey20","wndltlr9557!","jkey20");
	mysqli_query($con,'set names utf8');
	$result = mysqli_query($con, "SELECT * FROM LETTER;");

	$response = array();

	while($row = mysqli_fetch_array($result)){
		array_push($response, array("question" => $row[0], "ans1" => $row[1], "ans2" => $row[2],"ans3" => $row[3],"ans4"=>$row[4],"ans5" => $row[5],"answer"=>$row[6]));
	}
	echo json_encode(array("response" => $response));

	mysqli_close($con);
?>
