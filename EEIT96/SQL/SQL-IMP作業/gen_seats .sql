
begin
declare @_roomid varchar(10);
declare @v_ptime varchar(12);
declare @v_movie int;
declare @v_row int;
declare @v_col int;
declare @x_row int;
declare @x_col int;

set @_roomid='AÆU'
set @v_ptime='2016-12-25'
set @v_movie=1;

if(@_roomid='AÆU')
begin
set @v_row=25;
set @v_col=20;
end;

if(@_roomid='BÆU')
begin
set @v_row=20;
set @v_col=20;
end;

if(@_roomid='CÆU')
begin
set @v_row=15;
set @v_col=15;
end;

begin
set @x_row=1;
while(@x_row<=@v_row)
begin
set @x_col=1;
while (@x_col <=@v_col)
begin 
insert into seats 
values(@v_ptime,@v_movie,cast(@x_row as varchar(5))+'-'+cast(@x_col as varchar(5)),'0',null);
set @x_col+=1;
end;
set @x_col=1;
set @x_row+=1;
end;
end;
end;
