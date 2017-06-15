--ch6
--依學號(id)分組, 計算學員總分最高者 (含學號,總分)


select id, sum(score)
from  course
group by id
order by sum(score) desc


--method 1

select top 1 id, sum(score)
from  course
group by id
order by sum(score) desc

--test
select id, sum(score)
from  course
group by id
having sum(score)= 262

--method 2

select id, sum(score)
from  course
group by id
having sum(score)= (select top 1 sum(score)
                    from  course
                    group by id 
					order by sum(score) desc)

--test
select MAX(totals)
from (select  sum(score) totals
      from  course
      group by id ) t


--method 3

select id, sum(score)
from  course
group by id
having sum(score)= (select MAX(totals)
                    from (select  sum(score) totals
                    from  course
                    group by id ) t )


