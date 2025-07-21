# Write your MySQL query statement below
select s.student_id as student_id,s.student_name as student_name ,subj.subject_name as subject_name, (count(exam.subject_name)) as attended_exams
 from students s 
 cross join 
 subjects subj 
 left join 
 examinations exam  on s.student_id = exam.student_id and subj.subject_name = exam.subject_name 
 group by s.student_id,subj.subject_name,s.student_name
 order by s.student_id ,subj.subject_name ;
 