# Write your MySQL query statement below
select f1.user_id as user_id ,count(f1.follower_id) as followers_count from Followers f1   group by user_id order by f1.user_id asc;