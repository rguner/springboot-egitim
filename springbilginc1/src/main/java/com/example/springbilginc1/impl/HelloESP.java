package com.example.springbilginc1.impl;

import com.example.springbilginc1.intf.IHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("helloEsp")
public class HelloESP implements IHello {

    Logger logger= LoggerFactory.getLogger(HelloESP.class);

    @Override
    public void sayHello() {
        logger.info(" ---------------  ola");
    }
}
