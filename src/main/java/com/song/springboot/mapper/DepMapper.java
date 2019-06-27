package com.song.springboot.mapper;

import com.song.springboot.bean.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//指定这是一个数据库的mapper
//@Mapper
public interface DepMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department values(null,#{departmentName})")
    public void insert(Department department);

    @Select("select * from department where id = #{id}")
    public Department getBy(int id);
}
