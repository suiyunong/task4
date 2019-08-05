package cn.syn.tiles.springmvc.dao;

import cn.syn.tiles.springmvc.model.Career;

import java.util.List;

public interface CareerMapper {
    int deleteById(Long id);

    int insert(Career career);

    Career selectById(Long id);

    int update(Career career);

    List<Career> listCareer();

}