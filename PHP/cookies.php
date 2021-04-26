<?php

$year = (60 * 60 * 24 * 365);
setcookie("visited_time", time(), (time() + $year));

echo "<h1>WELCOME</h1><br/>";
if (isset($_COOKIE["visited_time"])) {
    $last_visited = $_COOKIE["visited_time"];
    echo "<i>Last Visit On: </i>" . date("d-m-Y H:i:s", $last_visited);
} else {
    echo "<i>This is your first time visiting!</i>";
}
