<?php


        if(isset($_COOKIE['font_size']))
                echo"<div style='margin:auto;text-align:center;border:solid blue 2px;width:50%;margin-top:15%'>Font-Size <b><span style='color:cyan'>".$_COOKIE['font_size']."</span></b><br><br>";
        if(isset($_COOKIE['font_style']))
                echo"Font-style <b><span style='color:cyan'>".$_COOKIE['font_style']."</span></b><br><br>";
        if(isset($_COOKIE['font_color']))
                echo"Font-Color <b><span style='color:cyan'>".$_COOKIE['font_color']."</span></b><br><br>";
        if(isset($_COOKIE['background_color']))
                echo"Background-Color <b><span style='color:cyan'>".$_COOKIE['background_color']."</span></b><br><br>";
?>

<html>
<head>
<title>USER PAGE</title>
</head>
<body bgcolor="<?php if(isset($_COOKIE['background_color'])) echo $_COOKIE['background_color'];?>">
     <span style="color:<?php if(isset($_COOKIE['font_color'])) echo $_COOKIE['font_color'];?>;font-family:<?php if(isset($_COOKIE['font_style'])) echo $_COOKIE['font_style'];?>;
     font-size:<?php if(isset($_COOKIE['font_size'])) echo $_COOKIE['font_size'];?>;">
        Welcome ............
        <br>This is user defined web page
          </span> </body>
</html>
