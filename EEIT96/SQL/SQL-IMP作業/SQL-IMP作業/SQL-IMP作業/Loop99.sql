create procedure loop99 (@First int, @Second int)
as
begin
declare @table table(result varchar(20))
while (@First <10 and @Second<10) 
begin
insert into @table
select cast(@First as varchar)+' '+'*'+' '+cast(@Second as varchar)+' '+'='+' '+cast(@First*@Second as varchar)
set @Second=@Second+1;
End
select * from @table
End

exec loop99 3,2;
exec loop99 9,9;