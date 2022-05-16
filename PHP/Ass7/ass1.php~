<?php

$r = $_GET['a'];
echo $r;
$conn = pg_connect("host=192.168.16.1 dbname=ty8885 user=ty8885 password=");

if($r==1)
{

	$actor_name = $_GET['test'];
      
	//$qr="SELECT movie.movie_name from movie,actor,m_a where movie.movie_no=m_a.movie_no and actor.actor_no=m_a.actor_no and actor.actor_name='".$_GET['test']."';";

	$result = pg_query($conn,"SELECT movie.movie_name from movie,actor,m_a where movie.movie_no=m_a.movie_no and actor.actor_no=m_a.actor_no and actor.actor_name='".$_GET['test']."';");
	
	if(!$result)
	{
		echo "Invalid";
		exit;
	}
	echo ("Movie Name:\n");
	while($row=pg_fetch_row($result))
	{
		echo $row[0];
	}


}

else if($r==2)
{
	$movie_no = $_GET['movie_no'];
	$movie_name = $_GET['movie_name'];
	$release_year = $_GET['release_year'];
	$actor_no = $_GET['actor_no'];
	$actor_name = $_GET['actor_name'];
	
	$result = pg_query("insert into movie values($movie_no,'$movie_name',$release_year);");
	$result1 = pg_query("insert into actor values($actor_no,'$actor_name');");
	$result2 = pg_query("insert into m_a values($movie_no,$actor_no);");
	if(!$result1)
		{
			echo "failed to add";
		}
	echo "values Inserted";
}

pg_close($conn);

?>
	
	

