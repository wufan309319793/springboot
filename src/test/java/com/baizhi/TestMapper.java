package com.baizhi;

import com.baizhi.dao.EmployeeMapper;
import com.baizhi.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapper {

	@Autowired(required = false)
	private EmployeeMapper employeeMapper;

	@Test
	public void contextLoads() {

        List<Employee> list = employeeMapper.selectAll();
        for (Employee employee : list) {
            System.out.println(employee);
            System.out.println("111111111111");
            System.out.println("222222222222222");
        }


    }

}
