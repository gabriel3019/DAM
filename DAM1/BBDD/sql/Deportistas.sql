create schema deportes;
use deportes;
CREATE TABLE deportes (
dep_id INT NOT NULL auto_increment,
dep_nombre VARCHAR(50) not null,
PRIMARY KEY (dep_id)
);
CREATE TABLE deportistas (
dta_id INT NOT NULL auto_increment,
dta_nombre VARCHAR(50) not null,
PRIMARY KEY (dta_id)
);
CREATE TABLE deportes_deportistas (
dep_id INT NOT NULL,
    dta_id INT NOT NULL,
PRIMARY KEY (dep_id, dta_id),
    foreign key (dep_id) references deportes(dep_id),
     foreign key (dta_id) references deportistas(dta_id)
);