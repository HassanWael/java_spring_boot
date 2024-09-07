package com.secondclass.second.couches;

import org.springframework.stereotype.Component;

@Component
public class Messi implements Couch{
    public String getCouch(){
        return "G.O.A.T";
    }
}
