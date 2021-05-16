# fibonacci till a limit

clear

echo "enter limit"

read lim

a=0

b=1

c=0

echo "fibonacci numbers :"

while [ $c -lt $lim ]

do

echo $a

temp=$b

b=`echo $a+$temp |bc` a=`echo $temp |bc`

c=`echo $c+1 |bc`

done