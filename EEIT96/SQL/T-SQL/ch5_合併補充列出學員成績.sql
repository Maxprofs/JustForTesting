--ch5
--列出學員姓名及各科成績
select * from student
select * from course order by id


select  s.id, s.name, c.id, c.name, c.score
from  student s JOIN course c
ON     s.id = c.id
order by s.id


--列出學員姓名及各科成績 (未參加考試的學員也要列出)

select  s.id, s.name, c.id, c.name, c.score
from  student s LEFT OUTER JOIN course c
ON     s.id = c.id
order by s.id

--adv 必修3科
select distinct name from course

--列出每人必修科
/*
select
from  student 23 CROSS JOIN  3
*/

select s.id, s.name, c1.name
from  student s CROSS JOIN  (select distinct name from course) c1
order by s.id

--交卷 65  -->69  差 4張

select s.id, s.name, c1.name, c.name, c.score
from  student s CROSS JOIN  (select distinct name from course) c1
left outer JOIN  course c
ON  s.id = c.id and
    c1.name = c.name
order by s.id

