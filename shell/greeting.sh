#clear

check=`date +%H`

echo $check

if [ $check -ge 06 -a $check -le 12 ]

then echo "Good morning"

elif [ $check -ge 12 -a $check -le 17 ]

then

echo "Good afternoon"else

echo "Good evening"

fi