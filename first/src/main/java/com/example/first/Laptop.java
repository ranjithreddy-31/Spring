package com.example.first;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")// value can be "singleton"-one object or "prototype"-objects on demand. Default value is "singleton"
public class Laptop {
    int id;
    String brand;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void show()
    {
        System.out.println("This is Laptop Class");
    }
}
