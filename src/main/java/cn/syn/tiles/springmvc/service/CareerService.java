package cn.syn.tiles.springmvc.service;

import cn.syn.tiles.springmvc.model.Career;

import java.util.List;

public interface CareerService {
    void deleteById(Long id);

    void insert(Career career);

    Career selectById(Long id);

    void update(Career career);

    List<Career> listCareer();
}
