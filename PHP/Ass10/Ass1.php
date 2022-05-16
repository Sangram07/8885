<?php
        if(isset($_COOKIE['font_size']))
                unset($_COOKIE['font_size']);
        if(isset($_COOKIE['font_style']))
                unset($_COOKIE['font_style']);
        if(isset($_COOKIE['font_color']))
                unset($_COOKIE['font_color']);
        if(isset($_COOKIE['background_color']))
                unset($_COOKIE['background_color']);
?>
<html>
<head>
<title>Cookie</title>
</head>
<body>
<h2 style="text-align:center;margin-top:8%">Create user Defined web Page</h2>
<form method="get" style="text-align:center;border: solid blue 2px; margin:auto;margin-top:2%;width:50%;font-size:20px" action="web1.php">
<br><br>

Font-size <select name="Font_size" required>
        <option value="12" selected>12</option>
        <option value="14">14</option>
        <option value="18">18</option>
        <option value="24">24</option>
</select>
<br><br>
Font-style <select name="Font_style" required>
        <option value="Sans" selected>Sans</option>
        <option value="Monospace" >Monospace</option>
        <option value="CM Roman" >CM Roman</option>
        <option value="Fixed" >Fixed</option>
</select>
<br><br>
Font-color <select name="Font_color" required>
        <option value="red" selected>Red</option>
        <option value="blue" >Blue</option>
        <option value="white" >White</option>
        <option value="green" >Green</option>
</select>
<br><br>
Background Color <select name="background_color" required>
        <option value="black" selected>Black</option>
        <option value="Sky blue" >SkyBlue</option>
        <option value="yellow" >Yellow</option>
        <option value="gray" >Gray</option>
</select>
<br><br>
<input type="submit" value="Create" name="Create"></input>
<br><br>

</form>

</body>
</html>

