--琩厩羆だ计程蔼 (﹎,羆だ)



--琩厩羆だ计程蔼 (﹎,羆だ)

select top 1 id , sum(score)
from  course
group by id
order  by sum(score) desc


select top 1 student.name , sum(score)
from  course JOIN student 
ON    course.id = student.id
group by student.name
order  by sum(score) desc

select top 1 student.id, student.name , sum(score)
from  course JOIN student 
ON    course.id = student.id
group by student.id, student.name
order  by sum(score) desc





with b
as (select id , sum(score) sums
    from  course  
	group by id
   )
select  *
from  b
where  sums = (select   MAX(sums)
               from  b)

