package com.javarush.task.task36.task3602;


import java.util.Collections;


/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
            Class<?>[] arrayOfClasses = Collections.class.getDeclaredClasses();

            return Collections.EMPTY_LIST.getClass();
    }
}
