package com.example.BelajarAndroid;

public class item {
    public item(String name, String desc) {
        this.name = name;
        Desc = desc;
    }

    String name;
    String Desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
