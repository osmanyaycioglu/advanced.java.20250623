package org.example.spring.cloud.spring.java.java8;

public class HelloFactory {
    public static IHello createHello(int type) {
        switch (type) {
            case 0:
                return new HelloTr();
            case 1:
                return new HelloEng();
            default:
                return new HelloTr();
        }
    }


    public static void main(String[] args) {
        int a = IGeneralConst.CHECK_LIMIT;
        for (int i = 0; i < IGeneralConst.ITEM_LENGTH; i++) {
            if (args.length == IGeneralConst.ARGUMENT_COUNT) {
                System.out.println(IGeneralConst.OK_STR);
            }
        }
    }
}
