package com.itheima.test;

import com.itheima.reggie.mapper.EmployeeMapper;
import com.itheima.reggie.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UploadFileTest {
//    @Autowired
//    private EmployeeMapper employeeMapper;
    @Test
    public void test01(){
        String originalFilename = "file.jpg";//获得上传文件的名字 如aa.jpg
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")); //截取后缀 如截取aa.jpg 的 .jpg
        System.out.println(suffix);
    }

    @Test
    public void test02(){

    }

}
