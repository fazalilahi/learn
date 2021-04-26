<?php

$limit = $_POST['input'];
$first = 0;
$second = 1;

echo "Fibonacci series upto $limit: <br>";
while ($second <= $limit) {
    echo "$first<br>";
    if ($second <= $limit)
        echo "$second<br>";
    $first += $second;
    $second += $first;
}
