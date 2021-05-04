#Armstrong or not

clear

echo "Enter a number"

read no

sum=0

temp=$no

while [ $no -gt 0 ]

do

m=`echo $no % 10 |bc`

cub=`echo $m\*$m\*$m |bc`

sum=`echo $sum+$cub |bc`

no=`echo $no/10 |bc`

done

if [ $temp -eq $sum ]

then echo "ARMSTRONG"

else

echo "NOT AN ARMSTRONG"

fi