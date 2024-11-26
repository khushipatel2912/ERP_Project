create database erp;
use  erp;
create table Domains(
domain_id int primary key,
program varchar(100) not null,
batch int,
capacity int ,
qualification varchar(100)
);

create table Organisation(
id int primary key,
name varchar(100) not null,
address varchar(100)
);

create table Placement(
id int primary key,
organisation int,
profile varchar(100),
description text,
intake int ,
minimum_grade int
);
create table Placement_Student(
id int,
placement_id int,
student_id int,
cv_application varchar(100),
about varchar(100),
acceptance varchar(100) default null,
comments varchar(100) default null,
date date 
);

create table Student(
student_id int primary key,
roll_number varchar(100) not null unique,
first_name varchar(100) not null,
last_name varchar(100),
email varchar(100) unique not null,
photograph_path varchar(100) null,
cgpa varchar(10),
total_credits int,
graduation_year year,
domain int,
specialisation int,
placement_id int,
password varchar(255)
);

create table Specialisation(
specialisation_id int primary key,
code varchar(10) unique not null,
name varchar(100) not null,
description text,
year year ,
credits_required int
);







 

