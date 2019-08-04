create table product(id integer auto_increment, price integer, name varchar(255), descrip varchar(255), primary key (id));
create table review (id integer auto_increment, headline varchar(255), content varchar(255), product_id integer, primary key (id));
create table comment (id integer auto_increment, headline varchar(255), content varchar(255), review_id integer, primary key (id));
