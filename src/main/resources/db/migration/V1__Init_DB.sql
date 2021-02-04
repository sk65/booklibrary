drop table if exists book;
drop table if exists user;
create table book
(
    id      bigint not null auto_increment,
    name    varchar(255),
    user_id bigint,
    primary key (id)
) engine = InnoDB;
create table user
(
    id   bigint not null auto_increment,
    name varchar(255),
    primary key (id)
) engine = InnoDB;
alter table book
    add constraint FK1wxwagv6cm3vjrxqhmv884hir foreign key (user_id) references user (id)