package cn.bugstack.test.infrastructure.dao;

import cn.bugstack.infrastructure.dao.IGroupBuyActivityDao;
import cn.bugstack.infrastructure.dao.IGroupBuyDiscountDao;
import cn.bugstack.infrastructure.dao.po.GroupBuyActivity;
import cn.bugstack.infrastructure.dao.po.GroupBuyDiscount;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @description 单测
 * @create 2026/10/19 18:49
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupBuyDiscountDaoTest {
    @Resource
    private IGroupBuyDiscountDao groupBuyDiscountDao;

    @Test
    public void test_(){
        List<GroupBuyDiscount> groupBuyDiscounts = groupBuyDiscountDao.queryGroupBuyDiscountList();
        log.info("测试结果：{}", JSON.toJSONString(groupBuyDiscounts));
    }
}
