package cn.syn.tiles.springmvc.dao;

import cn.syn.tiles.springmvc.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteById(Long id);

    int insert(Student student);

    Student selectById(Long id);

    int update(Student student);

    List<Student> listStu();

    List<Student> selectBySalary();
}