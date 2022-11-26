package com.mesnu.app;

import com.mesnu.app.singleton.SingA;
import com.mesnu.app.singleton.SingB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternsApplicationTests {
    @Autowired
    SingB singB1;
    @Autowired
    SingB singB2;
    @Test
    void contextLoads() {
    }

    @Test
    public void testSingletons(){

        SingA singA1 = SingA.getInstance();
        SingA singA2 = SingA.getInstance();

        // singleton test of SignA class
        Assertions.assertNotNull(singA1);
        Assertions.assertSame(singA1, singA2);

        // spring bean singleton test
        Assertions.assertNotNull(singB1);
        Assertions.assertSame(singB1, singB2);
    }

}
