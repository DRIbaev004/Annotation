package com.company;

import java.lang.reflect.Field;
import java.util.Objects;

public class RandomNumberGenerator {
//    public void process(Object o) throws IllegalAccessException {
//        Field[] fields = o.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            RandomNumber rn = field.getDeclaredAnnotation(RandomNumber.class);
//            if(!Objects.isNull(rn)){
//                field.setAccessible(true);
//                field.set(o,generate(rn.min(),rn.max()));
//            }
//        }
//    }
//    public int generate(int min, int max){
//        return (int)Math.floor(Math.random()*(max - min + 1) + min);
//    }
    public void process(Object o){
        Field[] fields = o.getClass()
    }
}
