<?php

$string = $_POST['input'];
$length = strlen($string);

echo "<h1>Reverse a String </h1>
    Reverse of $string: ";
for ($i = ($length - 1); $i >= 0; $i--) {
    echo "<b>$string[$i]</b>";
}
