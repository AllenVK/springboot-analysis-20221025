package com.paul.utils;

import java.util.Objects;

/**
 * 空字符串、空集合、空对象检测工具
 * Date: 2022-11-07 14:10
 * Author: Paul
 */
public class NullCheckUtil {

    public NullCheckUtil() {
        throw new IllegalStateException("Object cannot be instantiated");
    }

    /**
     * 判断对象是否为 null
     * @param obj 指定要校验的对象
     * @return true 对象为 null | false 对象不为 null
     */
    public static boolean objectIsNull(Object obj) {
        return Objects.isNull(obj);
    }

    /**
     * 判断对象是否不为 null
     * @param obj 指定要校验的对象
     * @return true 对象不为 null | false 对象为 null
     */
    public static boolean objectNonNull(Object obj) {
        return Objects.nonNull(obj);
    }

    /**
     * 判断对象是否不为 null
     * @param obj 指定要校验的对象
     * @return true 对象不为 null | false 对象为 null
     */
    public static void  objectRequireNonNull(Object obj) {
        Objects.requireNonNull(obj);
    }

}
