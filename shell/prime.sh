clear

echo "enter a number"

read i

c=2

echo "Prime numbers are :"

while [ $c -le $i ]

do

x=2

flag=0

while [ $x -le `echo $c/2 |bc` ]

do

if [ `echo $c % $x |bc` -eq 0 ]

then

flag=1

fi

x=`echo $x + 1 |bc`

done

if [ $flag -eq 0 ]

then

echo "$c"

fi

c=`echo $c + 1 |bc`

done