package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import rr.com.chapter5.pojo.EmployeeTask;

import java.util.List;

public interface EmployeeTaskMapper {
    public List<EmployeeTaskMapper> getEmployeeTaskByEmpId(@Param("empId") Long empId);
    public Integer insertEmployeeTaskMapper(@Param("employeeTask") EmployeeTask employeeTask);
}
