
--create database DB01
--go
use DB01
go

drop table student;

create table student
( id    int,
  name  nchar(20),
  bdate date,
  tel   char(20)
);
go
insert into student values ( 1, '劉于豪','1993-04-21','09205556781');
insert into student values ( 2, '王子豪','1993-09-23','09205556789');
insert into student values ( 3, '李承翰','1993-08-25','09205556785');
insert into student values ( 4, '楊聲遠','1993-07-27','09205556723');
insert into student values ( 5, '莫舒蔓','1993-05-29','09205556889');
insert into student values ( 6, '王傳紘','1993-06-22','09205556729');
insert into student values ( 7, '趙洵'  ,'1993-03-24','09205556726');
insert into student values ( 8, '閻昱宏','1993-01-26','09205556729');
insert into student values ( 9, '何偉銘','1993-02-28','09205556789');
insert into student values (10, '宋沛瑜','1993-11-20','09205556782');
insert into student values (11, '張哲豪','1993-10-21','09205556729');
insert into student values (12, '林昱承','1993-04-23','09205556389');
insert into student values (13, '張峰銘','1993-05-25','09205556728');
insert into student values (14, '姚沛宏','1993-07-23','09205556029');
insert into student values (15, '張勇智','1993-02-27','09205556783');
insert into student values (16, '劉駿'  ,'1993-04-23','09205556789');
insert into student values (17, '許瑋如','1993-06-29','09205556781');
insert into student values (18, '夏永倫','1993-04-22','09205556780');
insert into student values (19, '游智諺','1993-08-24','09205556789');
insert into student values (20, '林詠暉','1993-04-26','09205556787');
insert into student values (21, '張哲愷','1993-09-28','09205556089');
insert into student values (22, '劉有註','1993-04-20','09205556189');
insert into student values (23, '蔡昀佑','1993-05-25','09205556188');
insert into student values (24, '陳玨鄅','1993-07-23','09205556389');
insert into student values (25, '高至緯','1993-02-27','09205556183');
insert into student values (26, '劉姝妤','1993-04-23','09205556489');
insert into student values (27, '周庭羽','1993-06-29','09205556181');
insert into student values (28, '邱哲倫','1993-04-22','09205556180');
insert into student values (29, '徐健堯','1993-08-24','09205556289');
insert into student values (30, '張耀元','1993-04-26','09225556287');
insert into student values (31, '章自為','1993-04-27','09225556281');
insert into student values (32, '張振倫','1993-04-27','09225557272');
insert into student values (33, '黃盟仁','1993-05-25','09225556188');
insert into student values (34, '黃靖'  ,'1993-07-23','09225556389');
insert into student values (35, '蘇品全','1993-02-27','09225556183');
insert into student values (36, '洪東毅','1993-04-23','09225556489');
insert into student values (37, '劉哲維','1993-06-29','09225556181');
insert into student values (38, '盧清翊','1993-04-22','09225556180');
insert into student values (39, '吳秉哲','1993-08-24','09225556289');
insert into student values (40, '林以泰','1993-04-26','09225556287');
go

select * from student