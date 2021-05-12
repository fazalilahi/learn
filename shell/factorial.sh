#factorial of a number

clear

echo "enter a number"

fact=1

read n

cp=$n

while [ $n -gt 0 ]

do

fact=`echo $fact\*$n |bc`

n=`echo $n-1 |bc`

done

echo "Factorial of $cp is " $fact