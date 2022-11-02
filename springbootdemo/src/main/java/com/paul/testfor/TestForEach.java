package com.paul.testfor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Date: 2022-11-02 15:48
 * Author: Paul
 */
public class TestForEach {

    public static void main(String[] args) {
        //测试增强for循环中使用add/remove方法
        //testForeach();
        System.out.println("=========================");
        //测试Iterator迭代器中使用add/remove方法
        testIterator();
    }

    public static void testIterator() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        System.out.println("没有删除元素前" + list);
        // 迭代器使用listIterator和iterator均可
        list.removeIf(integer -> integer == 3);
        System.out.println("删除元素后" + list);
    }

    public static void testForeach() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("---" + list);
        for (Integer j : list) {
            if (j.equals(3)) {
                list.remove(3);
                list.add(9);
            }
            System.out.println(j);
        }
        System.out.println("---" + list);
    }

}
