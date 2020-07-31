package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import rr.com.chapter5.pojo.MaleHealthForm;

public interface MaleHealthFormMapper {
    public MaleHealthForm getMaleHealthForm(@Param("empId") Long empId);
}
