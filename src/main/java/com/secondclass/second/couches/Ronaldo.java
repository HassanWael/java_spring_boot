package com.secondclass.second.couches;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Ronaldo implements Couch{

    @Override
    public String getCouch() {
        return "SUIIIIIIIIIIIIIIIIIII";
    }


}
