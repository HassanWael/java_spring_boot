package com.secondclass.second;

import com.secondclass.second.couches.Couch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunDemoController {

    private Couch myCouch;

//    public FunDemoController(Couch myCouch){
//        this.myCouch = myCouch;
//    }

    @Autowired
    public void setMyCouch(@Qualifier("ronaldo") Couch myCouch){
        this.myCouch = myCouch;
    }
    @GetMapping("/get")
    public String getCouch(){
        return this.myCouch.getCouch();
    }

}
