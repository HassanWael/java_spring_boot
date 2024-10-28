package com.secondclass.second.couches;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Ronaldo implements Couch{
    public Ronaldo(){
        System.out.println("Hello SUIIIIIIIIIIIIIIIIIII");
    }
    @Override
    public String getCouch() {

        return "SUIIIIIIIIIIIIIIIIIII";
    }


}


// token: pFnhrEtoJxleie/t7XNtBjslMqjZ32WyHuNErYF65sI9r4kn83cYaj7Cz/XLlJJQmDW8SFm3tsAZAkmaOSNjKBNHrbpRmE6gJ5aN2PIZnqfdjBm2/rtzIPSeZLhZFjDN3lNKdHGHl4hCvi2wbJaXdhradEMMxlhH/Oh8f+zrkWg+n92Rrg==
// token: pFnhrEtoJxleie/t7XNtBjslMqjZ32WyHuNErYF65sI9r4kn83cYaj7Cz/XLlJJQmDW8SFm3tsAZAkmaOSNjKBNHrbpRmE6gJ5aN2PIZnqfdjBm2/rtzIPSeZLhZFjDN3lNKdHGHl4hCvi2wbJaXdhradEMMxlhH/Oh8f+zrkWg+n92Rrg==