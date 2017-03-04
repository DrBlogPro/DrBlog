create database DrBlog;

use DrBlog;

create table users(
	uid int primary key auto_increment,
	email varchar(50) unique,
	touchphone char(11) unique,
	username varchar(10) unique,
	password varchar(20),
	signtime datetime,
	sex varchar(1)
);

create table userinfo(
	uiid int primary key auto_increment,
	uid int,
	photo varchar(100),
	introduce varchar(200),
	illegal int,
	status int,
	money decimal
);

create table adminuser(
	adid int primary key auto_increment,
	uname varchar(10) unique,
	password varchar(10)
);

create table blog(
	bid int primary key auto_increment,
	uid int,
	olduser int,
	title varchar(50),
	pubtime datetime,
	tags varchar(50),
	blogtype int,
	url varchar(100),
	fid int 

);

create table tags(
	tagid int primary key auto_increment,
	name varchar(5)
);


create table folder(
	fid int primary key auto_increment,
	uid int,
	name varchar(20),
	newtime datetime,
	folderinfo varchar(50)

);

--↑↑↑↑↑基本功能↑↑↑↑↑



create table information(
	ifid int primary key auto_increment,
	uid int,
	title varchar(50),
	content varchar(200),
	sendtime datetime
);


create table attention(
	atid int primary key auto_increment,
	uid int,
	attentionuid int
);

create table bloginfo(
	bfid int primary key auto_increment,
	bid int,
	status int,
	good int,
	bad int,
	browse int,
	pay int,	
	hot double
);

create table reply(
	reid int primary key auto_increment,
	bid int,
	uid int,
	content varchar(200),
	retime datetime,
	forid int
);

create table report(
	repid int primary key auto_increment,
	bid int,
	content varchar(200),
	reporttime datetime
);


create table countinfo(
	countid int primary key auto_increment,
	countdate date,
	active int,
	money decimal
);

commit;

