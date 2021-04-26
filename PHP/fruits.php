<html>

<head>
    <title>Fruits</title>
</head>

<body>
    <h1>Your Favourite Fruits</h1>

    <?php
    foreach ($_POST['fruits_list'] as $fruit) {
        echo "$fruit<br>";
    }
    ?>

</body>

</html>