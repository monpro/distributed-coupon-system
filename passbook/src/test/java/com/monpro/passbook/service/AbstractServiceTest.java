package com.monpro.passbook.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by monpro.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractServiceTest {

    Long userId;

    @Before
    public void init() {

        userId = 149276L;
    }
}
