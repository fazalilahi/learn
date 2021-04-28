clear

echo "Enter the radius"

read r

area=`echo 3.14\*$r\*$r |bc`

echo "Area ="$area

cir=`echo 2\*3.14\*$r |bc`

echo "Circumference :" $cir