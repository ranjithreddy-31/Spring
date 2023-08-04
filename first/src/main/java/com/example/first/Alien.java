package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class  Alien {
    String name;
    int age;
    @Autowired
    Laptop laptop;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int agee)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void show()
    {
        System.out.println("This is Alien Class");
        laptop.show();

    }
}
