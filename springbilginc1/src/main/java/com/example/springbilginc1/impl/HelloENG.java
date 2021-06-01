package com.example.springbilginc1.impl;

import com.example.springbilginc1.intf.IHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("helloEng")
public class HelloENG implements IHello {

    Logger logger= LoggerFactory.getLogger(HelloENG.class);

    @Override
    public void sayHello() {
        logger.info(" ---------------  hello");
    }
}
