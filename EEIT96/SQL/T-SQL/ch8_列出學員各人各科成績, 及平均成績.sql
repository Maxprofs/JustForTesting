 --�C�X�ǭ��U�H�U�즨�Z, �Υ������Z
 select   avg(score)
 from   course

 select id ,name, score ,  (select   avg(score)
                            from   course)
 from   course
 order by name
