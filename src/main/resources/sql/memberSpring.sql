create table memberspring(
id varchar2(20) primary key,
pw varchar2(100),
addr varchar2(300)
);
insert into memberspring values('aaa','aaa','���¥��');
insert into memberspring values('bbb','bbb','������');
commit;
select * from memberspring;