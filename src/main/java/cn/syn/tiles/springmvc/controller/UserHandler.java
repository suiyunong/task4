package cn.syn.tiles.springmvc.controller;

import cn.syn.tiles.springmvc.model.Career;
import cn.syn.tiles.springmvc.model.Student;
import cn.syn.tiles.springmvc.service.CareerService;
import cn.syn.tiles.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private CareerService careerService;
    @Autowired
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    public void setCareerService(CareerService careerService) {
        this.careerService = careerService;
    }

    @RequestMapping(value = "/tiles")
    public String tileHome() {
        return "t11";
    }

        @RequestMapping(value = "/tag")
    public String tagTest(Model model) {
            long date = System.currentTimeMillis();
            model.addAttribute("date", date);
        return "tag";
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {
        List<Career> careerList = careerService.listCareer();
        model.addAttribute("careerList", careerList);
        long date = System.currentTimeMillis();
        model.addAttribute("date", date);
        return "homePage";
    }

    @RequestMapping(value = "/t10",method = RequestMethod.GET)
    public String t10(Model model) {
        List<Student> studentList = studentService.selectBySalary();
        model.addAttribute("student", studentList);
        return "t10";
    }

}
