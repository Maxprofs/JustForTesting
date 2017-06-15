 --列出學員各人各科成績, 及平均成績
 select   avg(score)
 from   course

 select id ,name, score ,  (select   avg(score)
                            from   course)
 from   course
 order by name
