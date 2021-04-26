<html>

<head>
    <title>Bio-Data</title>
</head>

<body>
    <table border="5" width="30%" cellpadding="5px" align="center">

        <tr>
            <td colspan="2">
                <center>Personal Details</center>
            </td>
        </tr>

        <tr>
            <td>NAME:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['name']; ?>
                </font>
            </td>
        </tr>


        <tr>
            <td>STATE:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['state']; ?>
                </font>
            </td>
        </tr>


        <tr>
            <td>GENDER:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['gender']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td>DOB:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['dob']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td>PHONE:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['phone']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td>E-MAIL:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['email']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <center>Educational Qualifications<center>
            </td>
        </tr>

       
        <tr>
            <td>UG:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['ug']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td>PG:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['pg']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <center>Extra-Curricular Activities</center>
            </td>
        </tr>

        <tr>
            <td>KNOW LANGUAGES:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['language']; ?>
                </font>
            </td>
        </tr>

        <tr>
            <td>HOBBY:</td>
            <td>
                <font color="brown">
                    <?php echo $_POST['hobby']; ?>
                </font>
            </td>
        </tr>

    </table>
</body>

</html>