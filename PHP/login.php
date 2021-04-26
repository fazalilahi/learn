<?php

$username = $_POST['username'];
$password = $_POST['password'];

$connection = "host=localhost port=5432 dbname=lab-php user=postgres password=1234";
$db = pg_connect($connection) or die("Could not connect" . pg_last_error());
$query = "SELECT * FROM login";
$cursor = pg_query($db, $query);
$result = pg_fetch_array($cursor);

if (($result[0] == $username) && ($result[1] == $password))
    echo "<b>Login Succesful</b>
        <br><h1>WELCOME</h1>";
else
    echo "<b>Login Failed</b>";
