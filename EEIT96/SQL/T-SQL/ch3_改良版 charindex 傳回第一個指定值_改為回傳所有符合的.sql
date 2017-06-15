--改良版 charindex 傳回第一個指定值, 改為回傳所有符合的
--method 1 以 substring 寫
create procedure p2 @v1 varchar(1), @v2 varchar(200) 
as
begin
  declare @x int = 1,
          @str varchar(200)=''

  while(@x <= len(@v2))
  begin
      if substring(@v2,@x,1) = @v1	     
		  set @str = @str + cast(@x as varchar(3)) + ', '   --print @x
      set @x = @x + 1
  end
  print @str
end;

exec p2  'c','abcd'       --3
exec p2  'c','abcdefgc'   --3,8
exec p2  'c','abcdeckcmm' --3,6,8
go

--method 2  以 charindex 寫
alter procedure p2 @v1 varchar(1), @v2 varchar(200) 
as
begin
  declare @x int = 1,
          @str varchar(200)=''

  while(@x <= len(@v2))
  begin
      if charindex( @v1 ,@v2,@x)  = @x     
		  set @str = @str + cast(@x as varchar(3)) + ', '   --print @x
      set @x = @x + 1
  end
  print @str
end;

exec p2  'c','abcd'       --3
exec p2  'c','abcdefgc'   --3,8
exec p2  'c','abcdeckcmm' --3,6,8
go


-- select charindex('c','abcd')
-- select charindex('c','abcd',1)
-- select charindex('c','abcd',2)
-- select charindex('c','abcd',3)
-- select charindex('c','abcd',4)
-- select charindex('c','abcdefgc',4)
-- select charindex('c','abcdefgc',5)
-- select charindex('c','abcdeckcmm',2)
-- select charindex('c','abcdeckcmm',5)
-- select charindex('c','abcdeckcmm',7)