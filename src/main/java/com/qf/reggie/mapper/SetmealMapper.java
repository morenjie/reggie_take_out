package com.qf.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.reggie.dto.SetmealDto;
import com.qf.reggie.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealMapper extends BaseMapper<Setmeal> {
    /**
     *  新增套餐，同时需要保存套餐和菜品的关联信息
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
}
