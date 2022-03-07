-- 01. Table Design

--You have been tasked to create the tables in the database by the following models:
--pictures
--Column Name
--Data Type
--Constraints
--id
--Integer, from 1 to 2,147,483,647.
--Primary Key
--AUTO_INCREMENT
--path
--A string containing a maximum of 255 characters. Unicode is NOT needed.
--NULL is NOT permitted.
--size
--Decimal, up to 10 digits, 2 of which after the decimal point.
--NULL is NOT permitted.

--users
--Column Name
--Data Type
--Constraints
--id
----Integer, from 1 to 2,147,483,647.
----Primary Key
----AUTO_INCREMENT
----username
----A string containing a maximum of 30 characters. Unicode is NOT needed.
----NULL is NOT permitted.
----UNIQUE values.
----password
----A string containing a maximum of 30 characters. Unicode is NOT needed.
----NULL is NOT permitted.
----profile_picture_id
----Integer, from 1 to 2,147,483,647.
----Relationship with table pictures.


--posts
--Column Name
--Data Type
--Constraints
--id
--Integer, from 1 to 2,147,483,647.
--Primary Key
--AUTO_INCREMENT
--caption
--A string containing a maximum of 255 characters. Unicode is NOT needed.
--NULL is NOT permitted.
--user_id
--Integer, from 1 to 2,147,483,647.
--Relationship with table users.
--NULL is NOT permitted.
--picture_id
--Integer, from 1 to 2,147,483,647.
--Relationship with table pictures.
--NULL is NOT permitted.

--comments
--Column Name
--Data Type
--Constraints
--id
--Integer, from 1 to 2,147,483,647.
--Primary Key
--AUTO_INCREMENT
--content
--A string containing a maximum of 255 characters. Unicode is NOT needed.
--NULL is NOT permitted.
--user_id
--Integer, from 1 to 2,147,483,647.
--Relationship with table users.
--NULL is NOT permitted.
--post_id
--Integer, from 1 to 2,147,483,647.
--Relationship with table posts.
--NULL is NOT permitted.


--users_followers
--Column Name
--Data Type
--Constraints
--user_id
--Integer, from 1 to 2,147,483,647.
--Relationship with table users.
--follower_id
--Integer, from 1 to 2,147,483,647.
--Relationship with table users.


--You will also be given a data.sql file. It will contain a dataset with random data which you will need to store in your local database. 
--This data will be given to you so you will not have to think of data and lose essential time in the process. 
--The data is in the form of INSERT statement queries. 



CREATE DATABASE IF NOT EXISTS instagraph;

USE instagraph;

CREATE TABLE IF NOT EXISTS pictures (
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    path VARCHAR(255) NOT NULL,
    size DECIMAL(10 , 2 ) NOT NULL
);
                        
CREATE TABLE IF NOT EXISTS users( 
					id INT(11) PRIMARY KEY AUTO_INCREMENT,
                    username VARCHAR(30) UNIQUE NOT NULL,
                    password VARCHAR(30) NOT NULL,
                    profile_picture_id INT(11),
                    CONSTRAINT fk_users_pictures  FOREIGN KEY (profile_picture_id) REFERENCES pictures(id)
                    );
                    
CREATE TABLE IF NOT EXISTS posts(
					id INT PRIMARY KEY AUTO_INCREMENT,
                    caption VARCHAR(255) NOT NULL,
                    user_id INT(11) NOT NULL,
                    picture_id INT(11) NOT NULL,
                    CONSTRAINT fk_posts_users FOREIGN KEY (user_id) REFERENCES users(id),
                    CONSTRAINT fk_posts_pictures FOREIGN KEY (picture_id) REFERENCES pictures(id)
                    );
                    
CREATE TABLE IF NOT EXISTS comments(
					   id INT(11) PRIMARY KEY AUTO_INCREMENT,
                       content VARCHAR(255) NOT NULL,
                       user_id INT(11) NOT NULL,
                       post_id INT(11) NOT NULL,
					CONSTRAINT fk_comments_users FOREIGN KEY (user_id) REFERENCES users(id),
					CONSTRAINT fk_comments_posts FOREIGN KEY (post_id) REFERENCES posts(id)
                    );
                    
CREATE TABLE IF NOT EXISTS users_followers(
							user_id INT(11),
                            follower_id INT(11),
                           CONSTRAINT fk_users_followers_users FOREIGN KEY (user_id) REFERENCES users(id),
						   CONSTRAINT fk_users_users_followers FOREIGN KEY (follower_id) REFERENCES users(id)
                    );
                    
INSERT INTO pictures (id, path, size)
VALUES
(1, 'src/folders/resources/images/profile/blocked/bmp/kjOJjKpKh4.bmp', 32495.57),
(2, 'src/folders/resources/images/post/timeline/png/27kLXVm22Q.png', 44273.27),
(3, 'src/folders/resources/images/profile/browsed/bmp/Q52q15Zefa.bmp', 12444.36),
(4, 'src/folders/resources/images/uploads/blocked/png/45Q92hqN5V.png', 51087.72),
(5, 'src/folders/resources/images/story/infigured/bmp/kBigUt6GJf.bmp', 6638.98),
(6, 'src/folders/resources/images/post/browsed/bmp/QBN576hx4u.bmp', 10673.45),
(7, 'src/folders/resources/images/mobile/blocked/digi/3ISlOl969f.digi', 33820.37),
(8, 'src/folders/resources/images/profile/blocked/jpg/pgfMG75k4e.jpg', 41669.90),
(9, 'src/folders/resources/images/post/infigured/jpeg/F665808Atc.jpeg', 239.69),
(10, 'src/folders/resources/images/post/blocked/img/DTy126lX2w.img', 31013.45),
(11, 'src/folders/resources/images/uploads/refined/jpeg/Dl5coYebcH.jpeg', 5826.43),
(12, 'src/folders/resources/images/story/browsed/png/ubMYHgzhYb.png', 35756.39),
(13, 'src/folders/resources/images/profile/reformatted/img/W0ks4a39fb.img', 13893.83),
(14, 'src/folders/resources/images/profile/blocked/jpeg/fB3x0NwaNY.jpeg', 12210.73),
(15, 'src/folders/resources/images/post/reformatted/jpeg/e72c83y974.jpeg', 6117.43),
(16, 'src/folders/resources/images/story/blocked/jpeg/6Zjri62vV7.jpeg', 59271.39),
(17, 'src/folders/resources/images/post/infigured/vga/73VdtF2MRV.vga', 364.47),
(18, 'src/folders/resources/images/post/infigured/digi/32L06LKKKG.digi', 20341.74),
(19, 'src/folders/resources/images/post/infigured/png/17c7oNj50V.png', 1581.75),
(20, 'src/folders/resources/images/story/browsed/jpg/p27t303Lra.jpg', 60160.73),
(21, 'src/folders/resources/images/profile/timeline/img/G77y9DQuv0.img', 45078.92),
(22, 'src/folders/resources/images/uploads/blocked/jpg/QBBXQT8K9D.jpg', 3616.76),
(23, 'src/folders/resources/images/profile/browsed/png/8c4B83uw03.png', 2479.23),
(24, 'src/folders/resources/images/mobile/infigured/digi/YV2Lj6g0t4.digi', 292.96),
(25, 'src/folders/resources/images/profile/infigured/png/064mWZ2NaQ.png', 9454.87),
(26, 'src/folders/resources/images/mobile/blocked/jpg/YzCzZ5qk3P.jpg', 2129.41),
(27, 'src/folders/resources/images/post/infigured/vga/2vt1VWUuq3.vga', 13553.99),
(28, 'src/folders/resources/images/story/infigured/png/9H9M5a59Li.png', 34568.62),
(29, 'src/folders/resources/images/uploads/formed/png/719fXvccM9.png', 62300.48),
(30, 'src/folders/resources/images/profile/browsed/jpg/SFlUF20Ypm.jpg', 10158.76),
(31, 'src/folders/resources/images/story/blocked/png/1S2el3wJ3v.png', 10960.40),
(32, 'src/folders/resources/images/post/formed/vga/fO9Sp94k4K.vga', 52531.42),
(33, 'src/folders/resources/images/uploads/timeline/jpeg/2BZvc3RXA2.jpeg', 39184.46),
(34, 'src/folders/resources/images/mobile/blocked/jpg/reCEAwPN3Z.jpg', 2475.45),
(35, 'src/folders/resources/images/uploads/browsed/bmp/8AePN8J51t.bmp', 2433.36),
(36, 'src/folders/resources/images/post/formed/digi/6YLvj97k03.digi', 35037.91),
(37, 'src/folders/resources/images/profile/refined/jpg/g3BWLTG39t.jpg', 56284.92),
(38, 'src/folders/resources/images/story/reformatted/jpg/y3tGM8E88H.jpg', 41064.03),
(39, 'src/folders/resources/images/uploads/browsed/vga/n5xg70JZDw.vga', 30761.07),
(40, 'src/folders/resources/images/uploads/formed/vga/E5c2G5rHLF.vga', 45674.39),
(41, 'src/folders/resources/images/post/formed/jpg/5eEjkxhYd3.jpg', 33587.94),
(42, 'src/folders/resources/images/post/timeline/digi/cM8i5E0597.digi', 29979.08),
(43, 'src/folders/resources/images/profile/reformatted/png/4Hg7J3qBNc.png', 52470.04),
(44, 'src/folders/resources/images/profile/browsed/png/841p0J24Oa.png', 73543.36),
(45, 'src/folders/resources/images/story/reformatted/img/hRI3TW31rC.img', 39559.96),
(46, 'src/folders/resources/images/story/refined/digi/CZVLmmtd5Y.digi', 7084.08),
(47, 'src/folders/resources/images/story/infigured/vga/Rr1008VwPi.vga', 54634.07),
(48, 'src/folders/resources/images/mobile/reformatted/vga/Algy17q7VM.vga', 14957.07),
(49, 'src/folders/resources/images/uploads/formed/jpeg/5E5ak3CkhU.jpeg', 8757.29),
(50, 'src/folders/resources/images/mobile/infigured/bmp/03z18luJc0.bmp', 33591.08);

INSERT INTO users (id, username, password, profile_picture_id)
VALUES
(1, 'UnderSinduxrein', '4l8nYGTKMW', 36),
(2, 'BlaAntigadsa', ':Q5wjT4[e', 49),
(3, 'ANinedsa', 'El[MwhxY)J', 8),
(4, 'ScoreImmagidefon', '`NGU>oS', 39),
(5, 'BlaSinduxrein', 'wJyfcwg*', 45),
(6, 'WhoDenoteBel', 'ajmISQi*', 38),
(7, 'WhatTerrorBel', 'R+-<+..Pl3j^', 2),
(8, 'AryaDenotehow', 'NNY5<e=', 11),
(9, 'UnveiledDenoteIana', 'no0*[ijt', 6),
(10, 'ScoreSinduxIana', '8xI:@-j2_.T', NULL),
(11, 'RoundAntigaBel', '4S>7EUNeUC@kv', 2),
(12, 'DarkImmagidsa', 'R.fh[f1Zh>2', 43),
(13, 'RoundInspecindi', 'AdKs>q]u7P`C', 20),
(14, 'AryaNinehow', 'X6j>`Huf2F(I', 14),
(15, 'ScoreAntigarein', 'UUD3H))<', 43),
(16, 'TheDivineBel', '-gCi:_Ub?ypT', 7),
(17, 'RoundArmydsa', 'SZ?F-:hW', 16),
(18, 'HighAsmahow', 'lyqF\vUG', 10),
(19, 'ZendArmyhow', 'DbW>9,', 2),
(20, 'BlaImmagiIana', 'upE;fg6+)n', 1),
(21, 'DeleteMe', 'asd', 2);

INSERT INTO posts (id, caption, user_id, picture_id)
VALUES
(1, '#everything #fuck #ring #faith #insta #infinity #swag #sunglasses #suzanita #smiley #justdoit #the #sleepless #ocean', 15, 31),
(2, '#cool #justdoit #sky #ocean #reason #feminist #gram #faith #hope #insta', 18, 8),
(3, '#suzanita #beautiful #swag #hope #sleepless #dusk #infinity #faith #women #fuck #gram #ocean #epic', 6, 49),
(4, '#insta #reason #sunglasses #swag #justdoit #what #dusk #morning #madness #feminist', 15, 14),
(5, '#sky #dawn #gerynikol #madness #women', 4, 3),
(6, '#infinity #women #smiley #my #epic #reason #yolo #beautiful #dawn #faith #happy #suzanita #morning #swag', 12, 31),
(7, '#cool #suzanita #the #dawn #my', 18, 27),
(8, '#epic #happy #insta #dusk #hope #sleepless #sky #swag #reason #justdoit #morning #smiley #yolo #sunglasses #ring #madness', 11, 32),
(9, '#justdoit #yolo #happy #insta #cool #madness #morning #faith #smiley #fuck #gerynikol #feminist', 20, 20),
(10, '#smiley #justdoit #feminist #fuck #everything #epic #dusk #gram #happy #women', 20, 6),
(11, '#infinity #sleepless #sky #yolo #fuck #ocean #gerynikol #women #morning #justdoit #the #what #dusk #reason #dawn #insta #happy', 17, 22),
(12, '#morning #sunglasses #reason #cool #suzanita #sleepless #everything #madness #gerynikol #swag #ring #women #happy #smiley #dawn #what #dusk #hope #the', 10, 3),
(13, '#sunglasses #infinity #madness #dusk #fuck #justdoit #the #gerynikol #suzanita #happy #beautiful #epic #what', 19, 40),
(14, '#madness #reason #feminist #cool #sunglasses #hope #gram #suzanita #justdoit #infinity #yolo #insta #faith #epic', 7, 38),
(15, '#morning #beautiful #infinity #insta #gram #hope #sleepless #ocean #suzanita #faith #dawn #sunglasses', 15, 2),
(16, '#dusk #insta #justdoit #suzanita #ocean #my #everything', 8, 41),
(17, '#women #ocean #ring #yolo #morning #insta #everything #sunglasses #what #cool #swag #infinity #suzanita #feminist #sleepless #hope #madness #dusk #epic', 4, 39),
(18, '#gram #hope #my #sky #insta #suzanita #gerynikol #infinity #ring #dawn #smiley #everything #madness #women #beautiful #sunglasses #morning #sleepless #cool', 18, 9),
(19, '#hope #reason #women #my #dawn #fuck #gram #swag #infinity #smiley #ocean #everything #faith #madness #sunglasses', 15, 41),
(20, '#everything #dawn #fuck #faith #what #sunglasses #happy', 19, 44),
(21, '#gerynikol #sunglasses #sky #what #dusk #smiley #insta #feminist #everything', 5, 46),
(22, '#morning #epic #hope #ring #gerynikol', 15, 18),
(23, '#everything #swag #faith #beautiful #dawn #sunglasses #dusk #infinity #suzanita #ring #what #sky #fuck #women', 17, 13),
(24, '#reason #my #morning #sky #the', 10, 22),
(25, '#yolo #madness #ocean #suzanita #feminist #fuck #cool #gerynikol #sunglasses #morning #sky #insta', 16, 23),
(26, '#dusk #smiley #cool #ocean #sunglasses #everything #faith #reason', 18, 2),
(27, '#sleepless #madness #reason #fuck #suzanita #everything #what', 16, 10),
(28, '#my #fuck #gerynikol #feminist #yolo #hope #dusk #sunglasses #suzanita #cool #gram #ring #sky #what #ocean #reason #dawn', 19, 16),
(29, '#justdoit #happy #ocean #ring #my #the #sunglasses #dusk #hope #morning #smiley #yolo', 7, 2),
(30, '#the #yolo #swag #sleepless #cool #everything #justdoit #my #fuck #sky #sunglasses', 10, 22),
(31, '#morning #infinity #happy #sleepless #justdoit #fuck', 15, 7),
(32, '#dawn #madness #reason #suzanita #gram #epic #beautiful #fuck #cool #faith #sky #ring #women #everything #gerynikol #morning #sleepless', 14, 33),
(33, '#madness #my #happy #gram #insta #women #what #swag', 1, 8),
(34, '#gerynikol #happy #sky #epic #everything #suzanita', 1, 7),
(35, '#morning #ocean #sky #dusk #justdoit #hope #epic #what #the #suzanita #madness #my #ring', 8, 1),
(36, '#feminist #happy #ring #my #swag #gerynikol #sleepless #yolo', 11, 45),
(37, '#sky #what #yolo #happy #swag #beautiful #dusk #gerynikol #ring #suzanita #feminist #women #morning #smiley #gram', 8, 37),
(38, '#the #happy #yolo #morning #reason #insta #smiley #suzanita #sky #feminist #what #dawn #fuck #my #faith', 8, 35),
(39, '#faith #gram #suzanita #what #everything #ocean #gerynikol #sky #my', 15, 17),
(40, '#ocean #epic #cool #reason #swag #sleepless #gerynikol #fuck #yolo #ring #infinity #justdoit #hope #dawn #my #morning #sunglasses', 10, 45);

INSERT INTO comments (id, content, user_id, post_id)
VALUES
(1, 'What the fuck? Aaarghhhh! Why?', 10, 40),
(2, 'Wow! Wow, epic!! How?', 11, 22),
(3, 'This is just... this is the best! Why?', 20, 37),
(4, 'The best! Simply amazing! Love you!', 16, 19),
(5, 'What is this? Aaarghhhh! Wtf!', 4, 2),
(6, 'Beautiful Aaarghhhh! Love you!', 6, 2),
(7, 'This is just... That body tho!!! Love you!', 6, 7),
(8, 'The best! Oh my god! Wtf!', 10, 12),
(9, 'I cannot beleive this How are you so beautiful? Love you!', 10, 39),
(10, 'The best! Absolutely majestic! Lol', 20, 28),
(11, 'What the fuck? Wow, epic!! Love you!', 1, 40),
(12, 'I cannot beleive this Absolutely majestic! How?', 9, 11),
(13, 'This is just... Wow, epic!! Wtf!', 10, 5),
(14, 'Super! Simply amazing! Lol', 17, 11),
(15, 'I cannot beleive this Them legs tho!!! Wtf!', 10, 38),
(16, 'Oh my god! Aaarghhhh! Love you!', 5, 19),
(17, 'I cannot beleive this this is the best! Love you!', 12, 34),
(18, 'Beautiful That body tho!!! Love you!', 7, 26),
(19, 'What the fuck? this is the best! Why?', 15, 22),
(20, 'This is just... Absolutely majestic! How?', 11, 32),
(21, 'Beautiful Absolutely majestic! How?', 4, 25),
(22, 'Oh my god! this is the best! Why?', 4, 22),
(23, 'Wow! Wow, epic!! Copying that!', 13, 40),
(24, 'The best! Them legs tho!!! Copying that!', 18, 14),
(25, 'What the fuck? Simply amazing! Best wishes!', 7, 14),
(26, 'The best! Oh my god! Copying that!', 1, 27),
(27, 'Oh my god! Wow, epic!! Love you!', 4, 15),
(28, 'This is just... Oh my god! Wtf!', 17, 37),
(29, 'This is just... Wow, epic!! Best wishes!', 16, 3),
(30, 'I cannot beleive this That body tho!!! Best wishes!', 15, 36),
(31, 'Wow! Simply amazing! Why?', 4, 25),
(32, 'Super! Oh my god! Wtf!', 17, 2),
(33, 'Oh my god! Aaarghhhh! Why?', 11, 20),
(34, 'What is this? Wow, epic!! Best wishes!', 5, 24),
(35, 'The best! Simply amazing! Wtf!', 19, 40),
(36, 'I cannot beleive this That body tho!!! Copying that!', 6, 35),
(37, 'Oh my god! Simply amazing! Lol', 3, 29),
(38, 'What is this? Simply amazing! How?', 12, 20),
(39, 'This is just... Aaarghhhh! How?', 17, 36),
(40, 'Beautiful Wow, epic!! How?', 7, 34),
(41, 'Beautiful How are you so beautiful? Love you!', 3, 12),
(42, 'What the fuck? How are you so beautiful? Why?', 5, 5),
(43, 'Wow! this is the best! Best wishes!', 1, 32),
(44, 'Super! Absolutely majestic! Copying that!', 18, 26),
(45, 'What is this? Wow, epic!! How?', 2, 18),
(46, 'Oh my god! Simply amazing! How?', 10, 34),
(47, 'The best! Oh my god! Why?', 13, 20),
(48, 'What the fuck? Aaarghhhh! Copying that!', 16, 36),
(49, 'Beautiful Wow, epic!! Why?', 20, 5),
(50, 'I cannot beleive this Simply amazing! Lol', 5, 36);

INSERT IGNORE INTO users_followers (user_id, follower_id)
VALUES
(20, 10),
(5, 13),
(14, 12),
(5, 19),
(10, 13),
(4, 19),
(6, 12),
(14, 17),
(19, 9),
(20, 18),
(13, 10),
(2, 11),
(9, 13),
(20, 1),
(14, 5),
(1, 18),
(4, 10),
(18, 4),
(19, 18),
(20, 14),
(12, 2),
(5, 18),
(7, 10),
(18, 10),
(6, 17),
(2, 19),
(1, 6),
(1, 10),
(8, 14),
(5, 1),
(13, 5),
(4, 5),
(13, 6),
(16, 17),
(14, 10),
(18, 2),
(10, 6),
(7, 12),
(3, 17),
(5, 11),
(15, 10),
(16, 18),
(4, 3),
(18, 18),
(10, 8),
(17, 5),
(14, 19),
(2, 8),
(18, 3),
(13, 2),
(3, 2),
(16, 16),
(19, 1),
(10, 16),
(20, 10),
(8, 11),
(10, 14),
(7, 4),
(10, 6),
(2, 11),
(9, 18),
(7, 9),
(14, 14),
(9, 11),
(4, 20),
(14, 1),
(5, 4),
(8, 13),
(15, 20),
(20, 4),
(14, 3),
(19, 1),
(1, 6),
(15, 20),
(13, 19),
(19, 12),
(2, 3),
(13, 6),
(15, 10),
(2, 5),
(13, 19),
(12, 20),
(16, 8),
(7, 7),
(6, 14),
(9, 10),
(7, 19),
(18, 7),
(20, 7),
(6, 9),
(19, 9),
(19, 6),
(2, 2),
(20, 2),
(11, 3),
(19, 5),
(19, 15),
(11, 15),
(11, 19),
(5, 14);


---------------------------------
--02. Data Insertion

--You will have to INSERT records of data into the comments table, 
--based on the posts table. For posts with id between 1 and 10, 
--insert data in the comments table with the following values:

--content – set it to “Omg!{name}!This is so cool!”. Where the name is the username of the user that posted the post.
--user_id – MULTIPLY the id of the post by 3 and DIVIDE it by 2.
--ROUND the resulting value UP.
--post_id – the post’s id.

INSERT INTO comments(post_id,content,user_id)
SELECT p.id AS post_id , 
CONCAT('Omg!',u.username,'!This is so cool!') AS content,
CEIL (p.id * 3/2) AS user_id 
FROM instagraph.posts AS p
INNER JOIN users AS u 
ON p.user_id = u.id 
WHERE p.id  BETWEEN 1 AND 10;

---------------------------------
--03. Data Update

--UPDATE all users which do NOT have a profile picture. 
--Set their profile picture id to the count of followers they have. 
--If they have 0, set it to the user’s id.

UPDATE users AS u
SET profile_picture_id = (
SELECT COUNT(uf.follower_id) AS c 
FROM users_followers AS uf
WHERE uf.user_id = u.id)
WHERE u.profile_picture_id IS NULL;

----------------------------------
--04. Data Deletion

--Naturally, unpopular profiles are being treated as abandoned. 
--DELETE all users which do NOT follow anyone and no one follows them.

DELETE u FROM users AS u
LEFT JOIN users_followers AS uf ON u.id = uf.user_id 
WHERE uf.user_id IS NULL;
----------------------------------
--05. Users

--Extract from the database, all of the users. 
--ORDER the results ascending by user id.
--Required Columns
--id (users)
--username

SELECT u.id, u.username
FROM users AS u
ORDER BY u.id;
----------------------------------
--06. Cheaters

--Apparently, there was a bug that allowed users to follow themselves. You need to track them.
--Extract from the database, all of the users, which follow themselves. 
--ORDER the results ascending by user id.
--Required Columns
--id (users)
--username

SELECT u.id,u.username
FROM users as u
INNER JOIN users_followers As uf
ON u.id = uf.user_id
WHERE user_id = follower_id
ORDER BY uf.user_id;
------------------------------------
--07. High Quality Pictures

--High quality pictures have bigger size, naturally. 
--Extract from the database, all of the pictures, which have size, GREATER than 50000, and their path contains “jpeg” or “png”.
--ORDER the results descending by picture size.
--Required Columns
--id (pictures)
--path
--size

SELECT id,path,size
FROM pictures as p
WHERE size > 50000.00 AND (path LIKE '%jpeg' OR path LIKE '%png%')
ORDER BY p.size DESC;
-------------------------------------
--08. Comments and Users

--Extract from the database, all of the comments, and the users that posted them, so that they end up in the following format:
--{username} : {commentContent}
--ORDER the results descending by comment id.
--Required Columns
--id (comments)
--full_comment

SELECT c.id,CONCAT(u.username,' : ',c.content) AS full_comment
FROM comments as c
INNER JOIN users as u
WHERE u.id = c.user_id
ORDER BY c.id DESC;
--------------------------------------
--09. Profile Pictures

--Extract from the database, all of the users, which have the same profile picture.
--Extract the size of the picture and add “KB” to the end of it.
--ORDER the results ascending by user id.
--Required Columns
--id (users)
--username
--size (pictures)

SELECT u.id,username,CONCAT(p.size,' KB') AS 'size' FROM users AS u
INNER JOIN pictures AS p
ON p.id = u.profile_picture_id
WHERE u.profile_picture_id 
IN (SELECT inneru.profile_picture_id 
FROM users AS inneru 
WHERE inneru.id <> u.id)
ORDER BY u.id;
---------------------------------------
--10. Spam Posts

--Extract from the database, the top 5 posts, in terms of count of comments on them.
--ORDER the results descending by comments (count of comments), and ascending by post id.
--Required Columns
--id (posts)
--caption (posts)
--comments (count of comments)

SELECT p.id, p.caption, COUNT(c.id) AS 'comments'
FROM posts AS p
JOIN comments AS c ON p.id = c.post_id
GROUP BY p.id
ORDER BY comments DESC , p.id
LIMIT 5;
---------------------------------------
--11. Most Popular User

--Extract from the database, the most popular user – the 1st in terms of count of followers.
--Required Columns
--id (users)
--username
--posts (count of posts)
--followers (count of followers)

SELECT cf.id, u.username, COUNT(p.id) AS posts, cf.followers
FROM (
SELECT uf.user_id AS id,
COUNT(uf.follower_id) AS followers
FROM users_followers AS uf
GROUP BY uf.user_id) AS cf
JOIN users AS u ON cf.id = u.id
LEFT JOIN posts AS p ON cf.id = p.user_id
GROUP BY cf.id
ORDER BY followers DESC , u.id
LIMIT 1;
----------------------------------------
--12. Commenting Myself
--Extract from the database, for every user – the count of comments he has on his posts by himself.
--In other words, extract for each user, the count of comments he has placed on his own posts.
--ORDER the results descending by my_comments (count of comments), and ascending by user id.
--Required Columns
--id (users)
--username
--my_comments (count of comments)

SELECT u.id,u.username,
SUM(IF(c.user_id = u.id, 1, 0)) AS my_comments
FROM users AS u
LEFT JOIN posts AS p ON u.id = p.user_id
LEFT JOIN comments AS c ON p.id = c.post_id
GROUP BY u.id
ORDER BY my_comments DESC , u.id;
-----------------------------------------
--13. User Top Posts

--Extract from the database, the for every user – the post with the HIGHEST count of comments on it.
--If the user has NO posts, IGNORE him.
--If there are 2 posts at the top with the same count of comments, pick the one with the LOWER id.
--ORDER the results ascending by user id.
--Required Columns
--id (users)
--username
--post (top post caption)

SELECT u.id, u.username,p.caption
FROM users AS u
LEFT JOIN posts AS p
ON u.id = p.user_id
INNER JOIN comments AS c
ON p.id = c.post_id
GROUP BY u.id
ORDER BY u.id;
-------------------------------------------
--14. Posts and Commentators

--Extract from the database, the for every post – the count of users that have comments on it.
--NOTE: 1 user may have more than 1 comment on the post.
--ORDER the results descending by users (count of users), and ascending by post id.
--Required Columns
--id (posts)
--caption
--users (count of users)

SELECT p.id, p.caption, COUNT(c.user_id) AS users
FROM posts AS p
LEFT JOIN comments AS c 
ON p.id = c.post_id
GROUP BY p.id
ORDER BY users DESC , p.id;
--------------------------------------------
--15. Post

--Create a stored procedure udp_post which accepts the following parameters:

--username
--password
--caption
--path

--And checks the following things:
--If the password does NOT match the username in the users table:
--Throw an exception with error code ‘45000’ and message ‘Password is incorrect!’.
--If there is no picture with the given path in the pictures table:
--Throw an exception with error code ‘45000’ and message ‘The picture does not exist!’.
--If all checks pass, extract the id of the corresponding user, from the users table, 
--then the picture id from the pictures table and INSERT a new post into the posts table with the extracted data.

DROP PROCEDURE IF EXISTS udp_post;

DELIMITER $$
CREATE PROCEDURE udp_post
    (username VARCHAR(255), password VARCHAR(255), caption VARCHAR(255), path VARCHAR(255))
BEGIN
    START TRANSACTION;
    
    IF ((SELECT u.password FROM users AS u WHERE u.username = username) <> password) THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'Password is incorrect!';
        ROLLBACK;
    ELSEIF ((SELECT count(p.id) FROM pictures AS p WHERE p.path = path) <> 1) THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'The picture does not exist!';
        ROLLBACK;
    ELSE
        INSERT INTO posts 
            (caption, user_id, picture_id)
            SELECT caption,
            (SELECT u.id FROM users AS u WHERE u.username = username),
             (SELECT p.id FROM pictures AS p WHERE p.path = path);
        COMMIT;
    END IF;
END 
$$ DELIMITER ;

CALL udp_post('UnderSinduxrein', '4l8nYGTKMW', '#new #procedure', 'src/folders/resources/images/story/reformatted/img/hRI3TW31rC.img');
---------------------------------------------
--16. Filter

--Create a stored procedure udp_filter which accepts the following parameters:
--hashtag

--And extracts all posts that CONTAIN the given hashtag in their caption.
--The procedure should extract the user’s username.
--The hashtag will be given WITHOUT the ‘#’ sign.
--The posts should be ordered ascending by post id.

DROP PROCEDURE IF EXISTS udp_filter;

DELIMITER $$
CREATE PROCEDURE udp_filter(hashtag VARCHAR(100))
BEGIN
    SELECT 
        p.id, 
        p.caption AS 'caption', 
        u.username AS 'user'
    FROM 
         posts AS p
         INNER JOIN 
         users AS u
         ON p.user_id = u.id
    WHERE 
        p.caption LIKE CONCAT('%','#',hashtag,'%');
END 
$$ DELIMITER ;

CALL udp_filter('cool');
