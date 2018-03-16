package com.myimooc.seckill.dao;

import org.seckill.dao.SuccessKilledDao;
import org.seckill.entity.SuccessSeckilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * SuccessKilledDaoµ•‘™≤‚ ‘¿‡
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {

    @Autowired
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1001L;
        long phone = 13502123541L;
        int insertCount = successKilledDao.insertSuccessKilled(id,phone);
        System.out.println(insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1001L;
        long phone = 13502123541L;
        SuccessKilledDao successSeckilled = (SuccessKilledDao) successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(successSeckilled);
      
    }
}