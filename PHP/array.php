<?php

$NAMES = array(
    "Jake Peralta", "Amy Santiago", "Charles Boyle", "Rosa Diaz", "Charles Boyle",
    "Terry Jefford", "Amy Santiago", "Raymond Holt", "Michael Hitchcock", "Norm Scully"
);
$option = $_POST['option'];

switch ($option) {
    case 1:
        display_content($NAMES);
        break;
    case 2:
        display_sorted($NAMES);
        break;
    case 3:
        display_unique($NAMES);
        break;
    case 4:
        remove_last($NAMES);
        break;
    case 5:
        display_reverse($NAMES);
        break;
    case 6:
        search_array($NAMES);
        break;
    default:
        break;
}

function display_content($name_list)
{
    echo "<ul>";
    foreach ($name_list as $name) {
        echo "<li>$name</li>";
    }
    echo "</ul>";
}

function display_sorted($name_list)
{
    sort($name_list);
    echo "<ul>";
    foreach ($name_list as $name) {
        echo "<li>$name</li>";
    }
    echo "</ul>";
}

function display_unique($name_list)
{
    $unique_name_list = array_unique($name_list);
    echo "<ul>";
    foreach ($unique_name_list as $name) {
        echo "<li>$name</li>";
    }
    echo "</ul>";
}

function remove_last($name_list)
{
    echo "<ul>";
    for ($i = 0; $i < 9; $i++) {
        echo "<li>" . $name_list[$i] . "</li>";
    }
    echo "</ul>";
}

function display_reverse($name_list)
{
    echo "<ul>";
    for ($i = count($name_list) - 1; $i >= 0; $i--) {
        echo "<li>" . $name_list[$i] . "</li>";
    }
    echo "</ul>";
}

function search_array($name_list)
{
    $search_key = $_POST['search_key'];
    $count = 0;
    foreach ($name_list as $name) {
        if ($name == $search_key) {
            $count++;
        }
    }
    echo "The Name <b>$search_key</b> was found <b>$count</b> times in the List";
}
