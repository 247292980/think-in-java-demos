package com.lgp.thinkinjavademos.demo.BeanCopier;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/25 16:03
 * @DESCRIPTION
 **/
public class BeanCopierTest {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        sameCopy();
//        difCopy();
//        difCopyConvert();
        noSetterCopy();
//        lessSetterCopy();
//        lessSetterCopy2();
    }

    // 属性名称、类型都相同
    public static void sameCopy() {
        one one = new one();
        one.setId(1);
        one.setName("one");
        final BeanCopier copier = BeanCopier.create(one.class, two.class, false);
        two two = new two();
        copier.copy(one, two, null);
        System.out.println(one.toString());
        System.out.println(two.toString());
    }

    // 属性名称相同,类型不同
    public static void difCopy() {
        one one = new one();
        one.setId(1);
        one.setName("one");
        final BeanCopier copier = BeanCopier.create(one.class, oneDif.class, false);
        oneDif oneDif = new oneDif();
        copier.copy(one, oneDif, null);
        System.out.println(one.toString());
        System.out.println(oneDif.toString());
    }

    // 属性名称相同,类型不同的解决方法
    public static void difCopyConvert() {
        one one = new one();
        one.setId(1);
        one.setName("one");
        final BeanCopier copier = BeanCopier.create(one.class, oneDif.class, true);
        oneDif oneDif = new oneDif();
        copier.copy(one, oneDif, new Converter() {
            @Override
            public Object convert(Object value, Class target, Object context) {
                if (value instanceof Integer) {
                    return (Integer) value;
                } else if (value instanceof Timestamp) {
                    Timestamp date = (Timestamp) value;
                    return sdf.format(date);
                } else if (value instanceof BigDecimal) {
                    BigDecimal bd = (BigDecimal) value;
                    return bd.toPlainString();
                } else if (value instanceof String) {
                    return "" + value;
                }
                return null;
            }
        });
        System.out.println(one.toString());
        System.out.println(oneDif.toString());
    }

    // 目标无setter
    public static void noSetterCopy() {
        one one = new one();
        one.setId(1);
        one.setName("one");
        final BeanCopier copier = BeanCopier.create(one.class, oneNoSetter.class, false);
        oneNoSetter oneNoSetter = new oneNoSetter();
        copier.copy(one, oneNoSetter, null);
        System.out.println(one.toString());
        System.out.println(oneNoSetter.toString());
    }

    // 源无setter，都不能赋值了好吧？
    public static void noSetterCopy2() {

    }

    // 目标少setter
    public static void lessSetterCopy() {
        one one = new one();
        one.setId(1);
        one.setName("one");
        final BeanCopier copier = BeanCopier.create(one.class, oneLessSetter.class, false);
        oneLessSetter oneLessSetter = new oneLessSetter();
        copier.copy(one, oneLessSetter, null);
        System.out.println(one.toString());
        System.out.println(oneLessSetter.toString());
    }

    // 源少setter
    public static void lessSetterCopy2() {
        oneLessSetter oneLessSetter = new oneLessSetter();
//        oneLessSetter.setId(1);
        oneLessSetter.setName("one");
        final BeanCopier copier = BeanCopier.create(oneLessSetter.class, one.class, false);
        one one = new one();
        copier.copy(oneLessSetter, one, null);
        System.out.println(oneLessSetter.toString());
        System.out.println(one.toString());
    }
}
