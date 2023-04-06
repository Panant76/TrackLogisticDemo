create table personal (
    id bigserial primary key,
    surname varchar(255) not null,
    name varchar(255) not null,
    patronymic varchar(255),
    full_name varchar(255),
    name_lat varchar(255),
    birthday date
);

create table contacts (
    id bigserial primary key,
    pers_id bigint references personal(id),
    address varchar(255),
    phone_main varchar(16) not null
);

create table contacts_phone (
    contacts_id bigserial references contacts(id),
    phone varchar(16)
);

create table contacts_email (
    contacts_id bigserial references contacts(id),
    email varchar(64)
);

create table documents_types (
    id bigserial primary key,
    name varchar(255),
    comment varchar(255)
);

create table documents (
    id bigserial primary key,
    pers_id bigint references personal(id),
    document_id bigint references documents_types(id) not null,
    number varchar(255),
    date_from date,
    date_to date,
    issue varchar(255),
    image varchar,
    comment varchar(255)
);