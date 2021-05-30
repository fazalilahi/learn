clear

echo "Enter basic salary"

read bs

da=$((bs*40/100))

hra=$((bs*20/100))

gs=$((bs+da+hra))

echo "Gross Salary =$gs"