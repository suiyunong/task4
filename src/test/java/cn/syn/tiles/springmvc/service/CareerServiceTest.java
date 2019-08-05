package cn.syn.tiles.springmvc.service;

import cn.syn.tiles.springmvc.BaseTest;
import cn.syn.tiles.springmvc.model.Career;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class CareerServiceTest extends BaseTest{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private CareerService careerService;

    @Test
    public void deleteById() {
    }

    @Test
    public void insert() {
        Career career = new Career();
        career.setImg("http://www.jnshu.com/daily/87731?dailyType=others&total=109&page=1&uid=28087&sort=0&orderBy=3");
        career.setDevelopmentDirection("写苹果移动操作系统的");
        career.setCareerName("ios");
        career.setDescription("我是具体描述");
        career.setLimitCondition(2);
        career.setDifficulty(2);
        career.setPeriodOne(1);
        career.setPeriodTwo(3);
        career.setProspects((long) 500);
        career.setSalaryOne(10);
        career.setSalaryTwo(20);
        career.setSalaryThree(30);
        career.setEditorId(1);
        career.setCreateAt(System.currentTimeMillis());
        career.setUpdateAt(System.currentTimeMillis());
        career.setHint("我是hint");
        careerService.insert(career);
        
    }

    @Test
    public void selectById() {
        Career career = careerService.selectById((long) 1);
        System.out.println(career);
        
    }

    @Test
    public void update() {
        Career career = careerService.selectById((long) 1);
        career.setEditorId(2);
        careerService.update(career);
        
    }

    @Test
    public void listCareer() {
        List<Career> careerList = careerService.listCareer();
        for (Career career : careerList
                ) {
            System.out.println(career);
        }
    }
}