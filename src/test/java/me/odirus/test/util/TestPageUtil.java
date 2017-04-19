package me.odirus.test.util;

import me.odirus.tdd.util.PageUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by huangjing
 * Created on 2017/4/18
 */
public class TestPageUtil {
    @Test
    public void testCalculatePageNum() {
        Assert.assertEquals(PageUtil.calculatePageNum(0, 10), 0);
        Assert.assertEquals(PageUtil.calculatePageNum(10, 10), 1);
        Assert.assertEquals(PageUtil.calculatePageNum(11, 10), 2);
    }
}
