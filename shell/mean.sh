read -p "no 1 : " a

read -p "no 2 : " b

read -p "no 3 : " c

m=$(echo "scale=4; sum=$a+$b+$c; avg=sum/3.0; avg" | bc)

sd=$(echo "scale=4; sd=sqrt(($a-$m)^2+($b-$m)^2)+($c-$m)^2); sd" | bc -l)

echo Mean of $a, $b and $c is $m

echo Standard deviation is $sd 