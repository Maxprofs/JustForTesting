if not exists (select name from sys.databases where name = 'DB01')
  create database DB01
go 

use DB01
go

--delete from bid;
--delete from prod;


-- ******  remove tables ....
IF EXISTS (SELECT name FROM sysobjects
            WHERE type = 'U' AND name = 'bid')
   drop table bid
GO

IF EXISTS (SELECT name FROM sysobjects
            WHERE type = 'U' AND name = 'prod')
  delete from prod;
GO

IF EXISTS (SELECT name FROM sysobjects
            WHERE type = 'U' AND name = 'member')
   delete from member;
go

create table prod 
( pno    int  identity(90,1)    primary key,
  pclass char(10),
  pname  char(20),
  bprice int,
  edate  date,
  mno    int references member(mno) 
);
go

create table bid
( pno    int references prod(pno),
  mno    int references member(mno),
  bdate  datetime,
  bprice int
);
go

insert into member values (102, '劉于豪', '台北市中正路二段123號'  );
go
insert into member values (125, '王子豪', '雲林縣集美街四段500號'  );
go
insert into member values (104, '李承翰', '台中市忠孝路四段120號'  );
go
insert into member values (112, '莫舒蔓', '屏東縣八德東路四段351號');
go
insert into member values (101, '王傳紘', '台北市信義路三段100號'  );
go
insert into member values (117, '趙洵', '台北市基隆路一段172號'  );
go
insert into member values (107, '閻昱宏', '彰化市安和路四段102號'  );
go
insert into member values (108, '何偉銘', '新竹市文化路二段125號'  );
go
insert into member values (112, '宋沛瑜', '彰化市復興南路四段203號'  );
go
insert into member values (109, '張哲豪', '高雄市承德路一段351號');
go
insert into member values (115, '林昱承', '台北市民權東路四段351號');
go
insert into member values (114, '張峰銘', '台南市民族路一段188號'  );
go
insert into member values (110, '姚沛宏', '台北市永康路三段105號'  );
go
insert into member values (122, '張勇智', '台北市四維路二段133號'  );
go
insert into member values (103, '劉駿', '台北市和平東路三段351號');
go
insert into member values (113, '柯四海', '台北市信義路三段136號'  );
go
insert into member values (116, '許瑋如', '高雄市民生路三段199號'  );
go
insert into member values (105, '夏永倫', '台南市仁愛路一段223號'  );
go
insert into member values (118, '游智諺', '台北市康樂路二段951號');
go
insert into member values (106, '林詠暉', '台北市南京東路三段321號');
go
insert into member values (119, '張哲愷', '台北市吳興街四段102號'  );
go
insert into member values (120, '劉有註', '新竹市重新路三段142號'  );
go
insert into member values (121, '蔡昀佑', '台北市景新街一段357號');
go
insert into member values (123, '陳玨鄅', '台北市羅斯福路二段323號'  );
go
insert into member values (124, '高至緯', '台中市研究院路三段451號');
go
insert into member values (126, '劉姝妤', '台北市敦化北路三段123號'  );
go
insert into member values (133, '周庭羽', '台北市和平東路三段351號');
go
insert into member values (136, '楊孟軒', '台北市延吉街111號');
go
insert into member values (127, '呂柏賢', '台北市西寧路二段71號');
go
insert into member values (128, '蔡瑋倫', '台北市中華路一段502號'  );
go
insert into member values (129, '陳品宏', '台北市漢口街12巷123號'  );
go
insert into member values (135, '伍仕新', '台北市錦西街86號'  );
go
insert into member values (130, '江尹瑄', '台北市和平東路三段351號');
go
insert into member values (132, '徐浩崴', '台北市松仁路三段123號'  );
go
insert into member values (134, '李柏毅', '台北市信義路三段100號'  );
go
insert into member values (131, '李宗儒', '台北市信義路三段100號'  );
go

set IDENTITY_INSERT dbo.prod ON
go
insert into prod(pno, pclass, pname, bprice, edate, mno) values (2, '資訊類', 'i5 桌上型電腦', 19000, '2015-09-13',    101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (1, '資訊類', '32GB USB', 900, '2015-09-12',           101);  
insert into prod(pno, pclass, pname, bprice, edate, mno) values (3, '資訊類', 'IBM筆記型電腦', 29000, '2015-09-14',    102);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (4, '資訊類', 'Acer PDA n30', 6900, '2015-09-12',      102);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (5, '資訊類', '華碩主機板', 3900, '2015-09-16',        103);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (6, '資訊類', 'CD-PRO2', 2900, '2015-09-12',           104);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (7, '資訊類', 'IBM R51', 49000, '2015-09-14',          103);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (8, '資訊類', 'Sony筆記型電腦', 52900, '2015-09-15',   102);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (9, '資訊類', 'Ausu筆記型電腦', 49000, '2015-09-12',   102);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (10, '資訊類', 'HP筆記型電腦', 39000, '2015-09-12',    103);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (11, '資訊類', 'Benq筆記型電腦', 28900, '2015-09-14',  104);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (12, '資訊類', 'Toshiba筆記型電腦',38000,'2015-09-13', 105);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (13, '資訊類', 'CD-PRO2', 2800, '2015-09-16',          109);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (14, '資訊類', 'PIII桌上型電腦', 19900, '2015-09-12',  101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (15, '資訊類', 'i5-2.6G桌上型電腦',29000,'2015-09-15', 120);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (16, '資訊類', 'CD-PRO2', 28500, '2015-09-12',         101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (17, '資訊類', 'i5-3.2G桌上型電腦',39500,'2015-09-12', 102);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (18, '資訊類', 'IBM R51', 48900, '2015-09-14',         121);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (19, '資訊類', 'i5-1.8G桌上型電腦', 900, '2015-09-16', 116);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (20, '資訊類', 'Acer PDA n30', 6900, '2015-09-12',     117);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (21, '資訊類', 'Acer PDA n10', 5900, '2015-09-13',     101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (22, '資訊類', 'IBM R51', 47900, '2015-09-15',         101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (23, '資訊類', '華碩主機板', 3900, '2015-09-12',       113);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (24, '資訊類', '技嘉主機板', 3800, '2015-09-14',       121);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (25, '資訊類', '主機板-微星', 3400, '2015-09-12',      127);

insert into prod(pno, pclass, pname, bprice, edate, mno) values (26, '通訊類', 'hTC手機' , 9900, '2015-09-16',         122);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (27, '通訊類', 'SONY手機', 3900, '2015-09-13',         122);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (28, '通訊類', 'Ericsson手機', 6900, '2015-09-12',     131);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (29, '通訊類', 'iPhone手機', 10800, '2015-09-14',      132);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (30, '通訊類', 'Samsung手機', 8900, '2015-09-15',      131);

insert into prod(pno, pclass, pname, bprice, edate, mno) values (31, '通訊類', 'OKWAP手機', 7900, '2015-09-12',        132);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (32, '通訊類', '小米手機', 2900, '2015-09-12',         130);

insert into prod(pno, pclass, pname, bprice, edate, mno) values (33, '影片類', 'DVD古墓奇兵2', 250, '2015-09-16',       129);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (34, '影片類', 'DVD偷拐搶騙', 200, '2015-09-13',        128);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (35, '影片類', 'DVD地球末日', 300, '2015-09-14',        101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (36, '影片類', 'DVD1997勢不兩立', 220, '2015-09-12',    101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (37, '影片類', 'DVD魔鬼末日', 300, '2015-09-12',        101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (38, '影片類', 'DVD侏儸紀公園', 300, '2015-09-15',      107);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (39, '影片類', 'DVD魔戒首部曲', 300, '2015-09-14',      107);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (40, '影片類', 'DVD紐約黑幫', 200, '2015-09-13',        107);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (41, '影片類', 'DVD終極警探3', 250, '2015-09-12',       108);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (42, '影片類', 'DVD神鬼奇航', 300, '2015-09-16',        108);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (43, '影片類', 'DVD魔戒二部曲', 350, '2015-09-12',      108);

insert into prod(pno, pclass, pname, bprice, edate, mno) values (44, '書籍類', '守護女神月天', 200, '2015-09-12',       101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (45, '書籍類', '神奇寶貝', 200, '2015-09-14',           102);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (46, '書籍類', '機器人終結者', 200, '2015-09-13',       103);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (47, '書籍類', '七龍珠', 250, '2015-09-15',             104);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (48, '書籍類', '金田一少年之事件簿', 200, '2015-09-12', 101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (49, '書籍類', '名偵探柯南', 300, '2015-09-16',         101);

insert into prod(pno, pclass, pname, bprice, edate, mno) values (50, '精品類', 'BURBERRY 藍標', 8900, '2015-09-12',      101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (51, '精品類', 'Cd波士頓包', 7900, '2015-09-13',         105);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (52, '精品類', 'ine牛仔排扣外套', 9900, '2015-09-12',    101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (53, '精品類', 'KEEPAKLL 旅行包', 4900, '2015-09-14',    106);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (54, '精品類', 'LV圓統子母包', 2900, '2015-09-15',       107);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (55, '精品類', 'DINESEE 手提包', 1900, '2015-09-13',     101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (56, '精品類', '圓領短T', 450, '2015-09-12',             101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (57, '精品類', '立領短T', 390, '2015-09-12',             106);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (58, '精品類', '短袖襯衫', 420, '2015-09-16',            101);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (59, '精品類', '長袖襯衫', 390, '2015-09-12',            108);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (60, '精品類', '時尚女錶', 1700, '2015-09-14',           101);

insert into prod(pno, pclass, pname, bprice, edate, mno) values (61, '休閒類', 'Nike男運動鞋', 1500, '2015-09-13',       109);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (62, '休閒類', 'HanTen運動服', 600, '2015-09-15',        115);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (63, '休閒類', '健身器材', 7900, '2015-09-12',           119);
insert into prod(pno, pclass, pname, bprice, edate, mno) values (64, '休閒類', '吉他', 5900, '2015-09-12',               124);

insert into bid values ( 1, 101, '2015-09-15', 910);
insert into bid values ( 5, 107, '2015-09-16', 3900);
insert into bid values ( 5, 108, '2015-09-16', 3950);
insert into bid values ( 5, 127, '2015-09-17', 4000);
insert into bid values ( 3, 115, '2015-09-28', 29000);
insert into bid values ( 3, 123, '2015-09-28', 29500);

insert into bid values ( 26, 123, '2015-09-18', 9900);
insert into bid values ( 26, 135, '2015-09-19', 10000);
insert into bid values ( 26, 123, '2015-09-20', 10100);

insert into bid values ( 41, 115, '2015-09-18', 250);
insert into bid values ( 41, 106, '2015-09-19', 270);

insert into bid values ( 55, 125, '2015-09-18', 1900);
insert into bid values ( 55, 131, '2015-09-19', 1950);

insert into bid values ( 61, 115, '2015-09-16', 1200);

select * from member;
select * from prod;
select * from bid;
go