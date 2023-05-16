package com.mzerek.mzerekAop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MzerekAopServiceTests {

    @Autowired
    MzerekAopService mzerekAopService;

    @Test
    void testBeforeMzerekAop() {
        mzerekAopService.mzerekMethodService();
    }

}
