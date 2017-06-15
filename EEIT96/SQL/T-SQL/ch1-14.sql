
-- case 0 list number
declare @x  int 
set @x  = 5

print @x
go

-- case 1 list 1,2,3,4,...10
declare @x  int 
set @x  = 1
print @x

set @x  = 2
print @x

set @x  = 10
print @x
go

-- case 3 list number
declare @x  int 
set @x  = 1
while(@x<=10)
begin
  print @x
  set @x = @x + 1
end
go

-- tsql  --> sp

create procedure p1
as
declare @x  int 
set @x  = 1
while(@x<=10)
begin
  print @x
  set @x = @x + 1
end
go


--run
exec  p1
go


