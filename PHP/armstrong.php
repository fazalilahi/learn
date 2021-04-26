<?php

$num = $_POST['input'];
$numCopy = $num;
$sum = 0;

while ($num != 0) {
    $sum += (($num % 10) ** 3);
    $num /= 10;
}

echo "<h1>Armstrong Number</h1>";
if ($numCopy == $sum) {
    echo "$numCopy is an Armstrong number";
} else {
    echo "$numCopy is not an amstrong number";
}
