create procedure loop99(@x int, @y int)
as
declare @str varchar(100);
set @x=1;

while(@x<10)
begin
set @y=1;
set @str='';
while(@y<10)
begin
set @str=@str+(right('0'+cast(@x as varchar(5)),2)+'*'+right('0'+cast(@y as varchar(5)),2)+'='+right('0'+cast((@x*@y) as varchar(5)),2)+' ');

--if(@y<=@x)
--print @str;
set @y=@y+1;
end

print @str;
set @x=@x+1;
end


