package com.example.springbilginc1.impl;

import com.example.springbilginc1.intf.IHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("helloTr")
public class HelloTR implements IHello {

    Logger logger= LoggerFactory.getLogger(HelloTR.class);

    @Override
    public void sayHello() {
        logger.info(" --------------- merhaba");
    }
}
