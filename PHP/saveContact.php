<?php

require_once 'DbConnect.php';

switch($_POST['apicall']){
	
case 'sendContact';

	$displayName = $_POST['displayName'];
	$contactNumbers = $_POST['contactNumbers'];
	$contactEmailAddresses = $_POST['contactEmailAddresses'];
	$contctId = $_POST['contctId'];
	
	
	$stmt = $conn->prepare("INSERT INTO contact_number(Unique_id, displayName, contactNumbers, contactEmailAddresses) VALUES ('$contctId', '$displayName', '$contactNumbers', '$contactEmailAddresses')");
	//$stmt->bind_param('s',$user_id);
	$stmt->execute();
	echo "done";
	$conn->close();
	break;
	
	
}



?>