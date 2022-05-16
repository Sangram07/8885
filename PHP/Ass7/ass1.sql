drop table m_a cascade;
drop table actor cascade;
drop table movie cascade;

CREATE TABLE movie(movie_no int primary key,movie_name text NOT NULL,release_year int);

CREATE TABLE actor(actor_no int primary key,actor_name text NOT NULL);

CREATE TABLE m_a(movie_no int references movie(movie_no) on delete cascade, actor_no int references actor(actor_no) on delete cascade);
/*
INSERT INTO movie VALUES(1,'YJHD',2014);
INSERT INTO movie VALUES(2,'BB',2011);
INSERT INTO movie VALUES(3,'Atrangi Re',2021);
INSERT INTO movie VALUES(4,'Gehraiya',2022);
INSERT INTO movie VALUES(5,'Dangal',2021);

INSERT INTO actor VALUES(11,'Ranbir');
INSERT INTO actor VALUES(12,'Akshay');
INSERT INTO actor VALUES(13,'Dhanush');
INSERT INTO actor VALUES(14,'Siddhant');
INSERT INTO actor VALUES(15,'Amir');

INSERT INTO m_a VALUES(1,11);
INSERT INTO m_a VALUES(2,12);
INSERT INTO m_a VALUES(3,13);
INSERT INTO m_a VALUES(4,14);
INSERT INTO m_a VALUES(5,15);
*/
