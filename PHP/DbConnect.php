<?php

$servername = "localhost";
$username = "";
$password = "";
$database = "contact";

$conn = new mysqli($servername, $username, $password, $database);
 

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

?>