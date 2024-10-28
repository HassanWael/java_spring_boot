package com.secondclass.second.couches;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Messi implements Couch{
    public Messi(){
        System.out.println("Hello ankra messi");
    }
    public String getCouch(){
        return "G.O.A.T";
    }
}
