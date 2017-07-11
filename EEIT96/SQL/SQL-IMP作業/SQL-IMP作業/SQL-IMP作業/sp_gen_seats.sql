
create procedure gen_seats
@v_ptime varchar(20),
@v_movie int,
@_roomid varchar(10)
as
begin
declare @v_row int;
declare @v_col int;
declare @x_row int;
declare @x_col int;

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

