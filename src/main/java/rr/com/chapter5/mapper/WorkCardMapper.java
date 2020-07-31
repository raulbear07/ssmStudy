package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;

public interface WorkCardMapper {
    public WorkCardMapper getWorkCard(@Param("empId")Long empId);
}
