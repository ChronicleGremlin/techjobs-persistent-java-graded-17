--Part 1
--
-- job table:
 SELECT *
 FROM job;
   -- id int
   -- employer varchar
   -- name varchar
   -- skills varchar

--Part 2
 SELECT name
 FROM employer
 WHERE location = "St. Louis City";

--Part 3
 DROP TABLE job;

--Part 4
 SELECT * FROM skill
 INNER JOIN job_skills ON skill.id = job_skills.skills_id
 WHERE job_skills.jobs_id IS NOT NULL
 ORDER BY name ASC;
