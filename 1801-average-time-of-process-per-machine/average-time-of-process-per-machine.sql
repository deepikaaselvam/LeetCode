# Write your MySQL query statement below
select distinct machine_id,
round(sum(
    case 
    when activity_type='start'then - timestamp
        else timestamp
        end)/count(distinct process_id),3)
        as processing_time from Activity group by machine_id;