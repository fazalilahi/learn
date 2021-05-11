clear

echo -n "Enter the filename: "

read path

read lines words chars filename < <(wc $path)

echo "The file $filename has $lines lines, $words words and $chars chars."
