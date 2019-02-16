package net.cnway.bean;

import java.util.ArrayList;

/**
 * @author john.wang
 * @create 2019-02-16 8:55
 */
public class TempeteTest {
    public static void main(String[] args) {
        System.out.println();
        //

        System.out.println("args = [" + args + "]");
        System.out.println("TempeteTest.main");
        System.out.println("args = " + args);

        String[]array= new String[]{"lilei","hanmeimei","fenchang","liming"};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for (String s : array) {
            System.out.println(s);
        }
        for (String s : array) {
            
        }
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            
        }
        //模板四
        ArrayList arrayList = new ArrayList();
        arrayList.add("22222");

        arrayList.add("1111");
        arrayList.add("3333");
        arrayList.add("4444");

        for (Object o : arrayList) {
            System.out.println(o);
        }
        if (arrayList == null) {
            
        }
        if (arrayList != null) {
            
        }

    }
    public static final int NUM = 1;
    public static final String Name= "王精灵";

}
