package com.example.demoApps;

import org.springframework.stereotype.Component;

@Component
public class Demo
{
    private int id;  //default = 0
    private String name;  //default = null

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
