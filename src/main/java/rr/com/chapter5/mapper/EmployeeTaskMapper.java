package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import rr.com.chapter5.pojo.EmployeeTask;

import java.util.List;

public interface EmployeeTaskMapper {
    public List<EmployeeTask> getEmployeeTaskByEmpId(@Param("empId") Long empId);
    public Integer insertEmployeeTask(@Param("employeeTask") EmployeeTask employeeTask);
}
