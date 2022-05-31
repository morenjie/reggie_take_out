package com.qf.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.reggie.dto.SetmealDto;
import com.qf.reggie.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {
    /**
     *  新增套餐，同时需要保存套餐和菜品的关联信息
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
}
