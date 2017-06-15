declare @x  int 
set @x  = 1
while(@x<=10)
begin
  print @x
  set @x = @x + 1
end
go


declare @x int
set @x = 1
while(@x<=200)
begin
   print @x
   set @x = @x +1 
   end 