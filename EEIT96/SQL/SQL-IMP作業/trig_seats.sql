
create trigger trig_seats
on playlist
after insert
as begin
declare @v_ptime varchar(20);
declare @v_movie int;
declare @v_roomid varchar(10);

select @v_ptime =ptime,@v_movie=movie,@v_roomid=roomid from inserted;

exec gen_seats @v_ptime,@v_movie,@v_roomid;
end;
