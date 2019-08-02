package com.example.luckyMoney;

import java.util.List;

public interface LimitMoneyInterface {
    public  List<LimitConfig> findList();
    public  LimitConfig findById(String id);
    public  void insertLimit(LimitConfig limitConfig);
    public  void deleteById(String id);
    public  void updateLimit(LimitConfig limitConfig);
}
