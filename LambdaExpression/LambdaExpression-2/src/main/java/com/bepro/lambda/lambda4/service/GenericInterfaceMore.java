package com.bepro.lambda.lambda4.service;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/19 && 10:25 PM}
 */
@FunctionalInterface
public interface GenericInterfaceMore<P, S> {

    P add(P number, S text);

}
