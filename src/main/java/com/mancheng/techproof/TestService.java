package com.mancheng.techproof;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("Dynamic inject bean,name="+name);
    }
}
