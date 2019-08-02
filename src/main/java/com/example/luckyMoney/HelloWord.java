package com.example.luckyMoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
/**
 * @RestController 是@Controller和@ResponseBody 两者功能的结合
 */
public class HelloWord {

    /*@Value("${minMoney}")
    private BigDecimal minMoney;

    @Value("${description}")
    private  String description;*/

    @Autowired
    public LimitConfig limitConfig;

    @GetMapping("/hello")
    public  String sayHi(){

        return  "springboot"+limitConfig.getDescription();
    }
}
