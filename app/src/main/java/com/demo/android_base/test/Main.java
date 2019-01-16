package com.demo.android_base.test;

/**
 * created by tea9 at 2019/1/16
 */
public class Main {

    public static void main(String[] args) {
        TeaList<String> testList = new TeaList<>();
        testList.setChangeListener(new TeaChangeListListener() {
            @Override
            public void onChange() {
                System.out.println("监听到变化了");
            }
        });

        testList.add("tea9");
//        List<String> testList2 = new ArrayList<>();
//        testList2.add("tea9");
//        testList2.add("tea10");
//        testList.addAll(testList2);
//        testList.remove("tea9");

        for (int i = 0; i < testList.size(); i++) {
            System.out.println(testList.get(i));
        }

    }

}
