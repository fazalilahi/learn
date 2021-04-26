<?php

$regno = $_POST['register_no'];

$connection = "host=localhost port=5432 dbname=lab-php user=postgres password=1234";
$db = pg_connect($connection) or die("cannot connect to database" . pg_last_error());
$query = "SELECT * FROM student WHERE reg_no='$regno'";
$cursor = pg_query($db, $query);
$result = pg_fetch_row($cursor);

echo "<h1>EXAM RESULT</h1><br>";
if ($result != null) {
    echo "<table border=1 align=center>
            <tr>
                <td>Register no.</td>
                <td>$result[0]</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>$result[1]</td>
            </tr>
            <tr>
                <td>Mark</td>
                <td>$result[2]</td>
            </tr>
            <tr>
                <td>
                Grade</td>
                <td>$result[3]</td></tr>
            <tr>
        </table>";
} else {
    echo "<b>Student not found!</b>";
}
