clear

echo "Enter two numbers"

read a b

echo "MENU DRIVEN

1.Addition

2.Subtraction 3.Multiplication

4.Division

Exit"

while(( 0 ))

do

echo "choice??"

read n

case $n in

1)echo "Sum="$((a+b));;

2)echo "Difference="$((a-b));;

3)echo "Product="$((a*b));;

4)echo "Reminder="$((a/b));;

*)exit

esac

done