package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }
}
