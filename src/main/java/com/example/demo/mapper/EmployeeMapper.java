package com.example.demo.mapper;

import com.example.demo.bean.Employee;

/**
 * Created by Administrator on 2020/3/12.
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public void insertEmp(Employee employee);
}
