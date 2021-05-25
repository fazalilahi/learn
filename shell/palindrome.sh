clear

echo "Enter a string: "

read string

echo "Reverce of string :"

echo "$(echo "$string" | rev)"

if [[ "$(echo "$string" | rev)" == "$string" ]]; then

echo "Palindrome"

else

echo "Not a Palindrome"

fi