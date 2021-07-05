package com.example.demo.markerinterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //Class 나 Interface 그리고 enum에 사용 가능
public @interface NotEffective {
}
