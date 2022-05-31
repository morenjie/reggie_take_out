package com.qf.reggie.dto;

import com.qf.reggie.entity.Setmeal;
import com.qf.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
