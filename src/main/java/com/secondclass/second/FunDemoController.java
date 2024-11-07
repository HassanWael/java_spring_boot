package com.secondclass.second;

import com.secondclass.second.couches.Couch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunDemoController {

    private Couch myCouch;
    private Couch anotherCouch;

    @Autowired
    public FunDemoController(@Qualifier("ronaldo") Couch myCouch, @Qualifier("ronaldo") Couch anotherCouch){

        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCouch = myCouch;
        this.anotherCouch = anotherCouch;

    }

//    @Autowired autowired call the method auto
    public void setMyCouch(Couch myCouch){
        this.myCouch = myCouch;
    }
    @GetMapping("/get")
    public String getCouch(){
        return this.myCouch.getCouch();
    }
    @GetMapping("/check")
    public String check(){
        return "Comparing couch with another = " + (myCouch == anotherCouch);
    }

}
