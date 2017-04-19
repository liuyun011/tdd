package me.odirus.tdd.util;

/**
 * Created by huangjing
 * Created on 2017/4/18
 */
public class PageUtil {
    public static int calculatePageNum(int totalRecord, int pageSize) {
        return (totalRecord  +  pageSize  - 1) / pageSize;
    }
}
