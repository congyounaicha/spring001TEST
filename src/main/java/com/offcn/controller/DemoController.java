package com.offcn.controller;

import com.offcn.po.Car;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.Date;

@RestController
public class DemoController {
    @RequestMapping("findOneCar")
    public Car findOneCar(){
        return new Car(1,"hongqi",18888.88F,new Date());
    }
    @RequestMapping("/findCarById/{name}")
    public Car findCarById(@RequestParam(name = "id")Integer id, @PathVariable(name = "name")String name){
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setPrice(18888.88F);
        car.setCreateTime(new Date());
        return car;
    }

    /**
     * 通过前台传递的json串保存一个实体
     * @param car
     * @return
     */
    @RequestMapping("saveCarByJson")
    public Car saveCarByJson(@RequestBody Car car){
        return car;
    }
    /**
     * 通过前台传递的表单1保存一个实体
     * @param car
     * @return
     */
    @RequestMapping("saveCarByForm")
    public Car saveCarByForm(Car car){
        return car;
    }
    @InitBinder//将传递的参数中的字符串转化成日期时间
    public void convertStr2Time(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}
