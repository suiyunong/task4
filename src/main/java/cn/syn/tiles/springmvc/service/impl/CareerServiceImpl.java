package cn.syn.tiles.springmvc.service.impl;

import cn.syn.tiles.springmvc.dao.CareerMapper;
import cn.syn.tiles.springmvc.model.Career;
import cn.syn.tiles.springmvc.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("careerService")
public class CareerServiceImpl implements CareerService {
    @Autowired
    private CareerMapper careerMapper;

    @Override
    public void deleteById(Long id) {
        careerMapper.deleteById(id);

    }

    @Override
    public void insert(Career career) {
        careerMapper.insert(career);

    }

    @Override
    public Career selectById(Long id) {
        Career career =careerMapper.selectById(id);
        return career;
    }

    @Override
    public void update(Career career) {
        careerMapper.update(career);
    }

    @Override
    public List<Career> listCareer() {
        List<Career> careerList = careerMapper.listCareer();
        return careerList;
    }
}
