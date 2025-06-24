package org.example.spring.cloud.spring.java.generics;

import java.math.BigDecimal;

public class GenericMain {
    public static void main(String[] args) {
        ValueHolderString valueHolderStringLoc = new ValueHolderString();
        valueHolderStringLoc.setValue("osman");
        ValueHolderInteger valueHolderIntegerLoc = new ValueHolderInteger();
        valueHolderIntegerLoc.setValue(100);

        ValueHolder valueHolderLoc = new ValueHolder();
        valueHolderLoc.setValue("osman");
        valueHolderLoc.setValue(100);

        Object valueLoc = valueHolderLoc.getValue();
        if (valueLoc instanceof String){
            String str = (String) valueLoc;

        } else if (valueLoc instanceof Integer) {
            Integer intVal = (Integer) valueLoc;
        }


        ValueHolderGeneric<String> stringValueHolderGenericLoc  = new ValueHolderGeneric<>();
        stringValueHolderGenericLoc.setValue("osman");
        String valueLoc1 = stringValueHolderGenericLoc.getValue();

        ValueHolderGeneric<BigDecimal> bigDecimalValueHolderGenericLoc = new ValueHolderGeneric<>();
        bigDecimalValueHolderGenericLoc.setValue(BigDecimal.TEN);
        BigDecimal valueLoc2 = bigDecimalValueHolderGenericLoc.getValue();
    }
}
