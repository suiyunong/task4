package cn.syn.tiles.springmvc.service.impl;

import cn.syn.tiles.springmvc.dao.StudentMapper;
import cn.syn.tiles.springmvc.model.Student;
import cn.syn.tiles.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;



    @Override
    public void insert(Student student) {
        studentMapper.insert(student);


    }

    @Override
    public void deleteById(Long id) {
        studentMapper.deleteById(id);

    }

    @Override
    public Student selectById(Long id) {
        Student student = studentMapper.selectById(id);
        return student;
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public List<Student> listStu() {
        return null;
    }

    @Override
    public List<Student> selectBySalary() {
        List<Student> studentList = studentMapper.selectBySalary();
        return studentList;
    }
}
