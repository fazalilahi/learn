<?php

function factors_sum($num)
{
    $sum = 0;
    for ($i = 1; $i <= ($num / 2); $i++) {
        if ($num % $i == 0) {
            $sum += $i;
        }
    }
    return $sum;
}

$number = $_POST['input'];

echo "<h1>Perfect, Abundent or Deficient Number</h1>";
if (factors_sum($number) > $number) {
    echo "$number is Abundant<br>";
} elseif (factors_sum($number) < $number) {
    echo "$number is Deficient<br>";
} else {
    echo "$number is perfect<br>";
}
