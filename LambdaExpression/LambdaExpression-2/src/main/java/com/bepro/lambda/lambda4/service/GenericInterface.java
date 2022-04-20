package com.bepro.lambda.lambda4.service;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 10:34 PM}
 */
@FunctionalInterface
public interface GenericInterface<D> {
    // T - type
    D add(D number, D number1);

}
