package com.secondclass.second.couches;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Ronaldo implements Couch{

    @Override
    public String getCouch() {
        return "SUIIIIIIIIIIIIIIIIIII";
    }


}
