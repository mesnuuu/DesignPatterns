package com.mesnu.app;

import com.mesnu.app.prototype.ProtoFalse;
import com.mesnu.app.prototype.ProtoTrue;
import com.mesnu.app.repository.PresidentRepository;
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

    @Autowired
    ProtoTrue true1;
    @Autowired
    ProtoTrue true2;

    @Autowired
    ProtoFalse false1;
    @Autowired
    ProtoFalse false2;

    @Autowired
    PresidentRepository presidentRepository;

    @Test
    public void testRepository(){
        System.out.println(presidentRepository.findById(1L));
        System.out.println(presidentRepository.findById(2L));
    }


    @Test
    public void testPrototypes(){
        Assertions.assertSame(false1, false2);
        Assertions.assertNotSame(true1, true2);
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
