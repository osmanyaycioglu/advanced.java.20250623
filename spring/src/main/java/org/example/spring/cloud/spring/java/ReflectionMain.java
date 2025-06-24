package org.example.spring.cloud.spring.java;

import java.lang.reflect.Field;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        MyAppProps        myAppPropsLoc       = new MyAppProps();
        Class<?>          myAppPropsClassLoc1 = myAppPropsLoc.getClass();
        Class<MyAppProps> myAppPropsClassLoc2 = MyAppProps.class;

        Field[] declaredFieldsLoc = myAppPropsClassLoc2.getDeclaredFields();

        for (Field declaredFieldLoc : declaredFieldsLoc) {
            System.out.println("Field name : " + declaredFieldLoc.getName());
            System.out.println("Field name : " + declaredFieldLoc.getType());
            PropRead annotationLoc = declaredFieldLoc.getAnnotation(PropRead.class);
            if (annotationLoc != null) {
                System.out.println("PropRead : " + annotationLoc.prop() + " - " + annotationLoc.intVal());
            }

        }

        MyAppProps appPropsLoc = myAppPropsClassLoc2.newInstance();
        Field      fieldAppNameLoc  = myAppPropsClassLoc2.getDeclaredField("appName");
        if (fieldAppNameLoc != null) {
            fieldAppNameLoc.setAccessible(true);
            fieldAppNameLoc.set(appPropsLoc,"deneme uygulaması");
        }

        System.out.println("" + appPropsLoc);


    }
}
