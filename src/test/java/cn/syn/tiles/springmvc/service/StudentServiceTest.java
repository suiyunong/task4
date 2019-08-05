package cn.syn.tiles.springmvc.service;

import cn.syn.tiles.springmvc.BaseTest;
import cn.syn.tiles.springmvc.model.Student;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class StudentServiceTest extends BaseTest{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private StudentService studentService;


    @Test
    public void insert() {
        Student student = new Student();
        student.setImg("https://ss0.bdstatic50625/1155116323010604_b.jpg");
        student.setPosition("ios开发");
        student.setName("张单333");
        student.setIntro("我是简介");
        student.setSalary(20);
        student.setEmploymentStatus(1);
        student.setStatus(1);
        student.setEditorId(1);
        student.setCreateAt(System.currentTimeMillis());
        student.setUpdateAt(System.currentTimeMillis());
        studentService.insert(student);
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void selectById() {

    }

    @Test
    public void update() {
    }

    @Test
    public void listStu() {
    }
}