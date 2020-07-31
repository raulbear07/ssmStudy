package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import rr.com.chapter5.pojo.FemaleHealthForm;

public interface FemaleHealthFormMapper {
    public FemaleHealthForm getFemaleHealthForm(@Param("empId") Long empId);
}
