package cn.syn.tiles.springmvc.service;

import cn.syn.tiles.springmvc.model.Student;

import java.util.List;

public interface StudentService {
    //    添加方法，添加成功返回id
    void insert(Student student);

    //删除方法
    void deleteById(Long id);

    //    查找方法
    Student selectById(Long id);

    //更新方法
    void update(Student student);

    //查找所有
    List<Student> listStu();
//    取薪资排名前四的学员
    List<Student> selectBySalary();
}
