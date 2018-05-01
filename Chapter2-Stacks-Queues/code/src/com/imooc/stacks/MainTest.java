package com.imooc.stacks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author suyu
 * @version 1.0.0
 * @ClassName MainTest
 * @Description  xxx
 * @Date 2018/4/27 14:28
 */
public class MainTest {

    /**
     * 数组栈的测试方法
     */
    @Test
    public void testArrayStack() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
