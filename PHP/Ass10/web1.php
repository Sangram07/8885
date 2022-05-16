<?php

setcookie("font_size",$_GET['Font_size'],time());
setcookie("font_color",$_GET['Font_color'],time());
setcookie("font_style",$_GET['Font_style'],time());
setcookie("background_color",$_GET['background_color'],time());

if(isset($_GET['Create']))
{
        if(isset($_COOKIE['font_size']))
                echo"<div style='margin:auto;text-align:center;border:solid blue 2px;width:50%;margin-top:15%'>Font-Size <b><span style='color:cyan'>".$_COOKIE['font_size']."</span></b><br><br>";
        if(isset($_COOKIE['font_style']))
                echo"Font-style <b><span style='color:cyan'>".$_COOKIE['font_style']."</span></b><br><br>";
        if(isset($_COOKIE['font_color']))
                echo"Font-Color <b><span style='color:cyan'>".$_COOKIE['font_color']."</span></b><br><br>";
        if(isset($_COOKIE['background_color']))
                echo"Background-Color <b><span style='color:cyan'>".$_COOKIE['background_color']."</span></b><br><br>";
      echo'<a href="web2.php" style="text-decoration:none;"><input type="button" style="font-size:18px;color:blue;" value="Create WEBPAGE"></input></a></div>';  
}
else
{
        echo"Select Page Configuration First";
}

?>
