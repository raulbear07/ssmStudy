package rr.com.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import rr.com.chapter5.pojo.Task;

public interface TaskMapper {
    public Task getTask(@Param("id") Long id);
    public Integer insertTask(@Param("task") Task task);
}
