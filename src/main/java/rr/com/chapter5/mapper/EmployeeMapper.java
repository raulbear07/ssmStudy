package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import rr.com.chapter5.pojo.Employee;
import sun.util.resources.ga.LocaleNames_ga;

import java.util.List;

public interface EmployeeMapper {
    public Employee getEmployee(@Param("id") Long id);
    public List<Employee> getEmployeeByNames(@Param("name") String name);
}
