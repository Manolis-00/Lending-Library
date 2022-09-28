CREATE DATABASE library;

use library;

drop table if exists book;

create table category (
	id int not null,
    category_name varchar(50),
    primary key(id));

create table book (
	id int not null,
    title varchar(50),
    category_id int not null,
    publication_date datetime,
    copies_owned int,
    primary key(id),
    foreign key(category_id) references category(id));
    
create table author (
	id int not null,
    first_name varchar(50),
    last_name varchar(50),
    primary key(id));
    
create table book_author (
	book_id int not null,
    author_id int not null,
    foreign key (book_id) references book (id),
    foreign key (author_id) references author (id));
   
create table member_status (
	id boolean,
    status_value varchar(50),
    primary key(id));   
   
create table member (
	id int not null,
    first_name varchar(50),
    last_name varchar(50),
    joined_date datetime,
    active_status_id boolean,
    primary key(id),
    foreign key(active_status_id) references member_status(id));
    
create table loan (
	id int not null,
    book_id int not null,
    member_id int not null,
    loan_date datetime,
    returned_date datetime,
    primary key(id),
    foreign key(book_id) references book (id),
    foreign key(member_id) references member (id));
    
create table reservation_status (
	id int not null,
    status_values varchar(50),
    primary key(id));
    
create table reservation ( 
	id int not null,
    book_id int not null,
    member_id int not null,
    reservation_date datetime,
    reservation_status_id int not null,
    primary key(id),
    foreign key(book_id) references book(id),
    foreign key(member_id) references member(id),
    foreign key(reservation_status_id) references reservation_status(id));
    
create table cost (
	id int not null,
    member_id int not null,
    loan_id int not null,
    date_to_be_paid datetime,
    cost_amount double,
    primary key(id),
    foreign key(member_id) references member (id),
    foreign key(loan_id) references loan(id));
    
create table cost_payment (
	id int not null,
    member_id int not null,
    payment_date datetime,
    payment_amount double,
    primary key(id),
    foreign key(member_id) references member(id));
