# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table distrito (
  id                        bigint auto_increment not null,
  distrito                  varchar(255),
  constraint pk_distrito primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table distrito;

SET FOREIGN_KEY_CHECKS=1;

