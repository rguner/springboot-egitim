package com.example.springbilginc1.core;

import com.example.springbilginc1.intf.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Language {

    @Autowired
    @Qualifier("helloEng")
    IHello iHello;

    @PostConstruct
    public void init() {
        hello();
    }

    public void hello() {
        iHello.sayHello();
    }
}
