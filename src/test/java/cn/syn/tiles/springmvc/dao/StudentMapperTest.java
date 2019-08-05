package cn.syn.tiles.springmvc.dao;

import cn.syn.tiles.springmvc.BaseTest;
import cn.syn.tiles.springmvc.model.Student;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest extends BaseTest{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private StudentMapper studentMapper;

    @Test
    public void deleteById() {



    }

    @Test
    public void insert() {
        Student student = new Student();
        student.setImg("https://ss0.bdstatic50625/1155116323010604_b.jpg");
        student.setPosition("web开发");
        student.setName("李建");
        student.setIntro("我是简介");
        student.setSalary(20);
        student.setEmploymentStatus(1);
        student.setStatus(1);
        student.setEditorId(1);
        student.setCreateAt(System.currentTimeMillis());
        student.setUpdateAt(System.currentTimeMillis());
        studentMapper.insert(student);
    }

    @Test
    public void selectById() {
        Student student = studentMapper.selectById((long) 1);
        System.out.println(student);

    }

    @Test
    public void updateById() {
        Student student = studentMapper.selectById((long) 1);
        student.setSalary(40);
        studentMapper.update(student);
    }

    @Test
    public void listStu() {
        List<Student> studentList = studentMapper.listStu();
        for (Student stu : studentList
                ) {
            System.out.println(stu);
        }
    }
    @Test
    public void selectBySalary() {
        List<Student> studentList = studentMapper.selectBySalary();
        for (Student stu : studentList
                ) {
            System.out.println(stu);
        }
    }
}