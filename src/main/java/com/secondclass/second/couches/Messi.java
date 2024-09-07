package com.secondclass.second.couches;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Messi implements Couch{
    public String getCouch(){
        return "G.O.A.T";
    }
}
