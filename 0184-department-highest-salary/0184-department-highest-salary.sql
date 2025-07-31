# Write your MySQL query statement below
select Department.name as Department, Employee.name as Employee, Employee.salary as Salary
from Employee 
inner join Department
on Department.id = Employee.departmentId
where(Department.id, Employee.salary)
in (select departmentId, max(salary)
from Employee
group by departmentId);