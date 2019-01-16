package com.demo.android_base.test;

import java.util.ArrayList;
import java.util.List;

/**
 * created by tea9 at 2018/12/27
 * [如何在Java中添加上的ArrayList监听(How to add listener on ArrayList in java)]http://www.it1352.com/231623.html
 * [Android中解决RecyclerView各种点击事件的方法]https://www.jb51.net/article/140578.htm
 */
public class TeaList<T> {

    private TeaChangeListListener listener;

    private ArrayList<T> list;

    public TeaList() {
        list = new ArrayList<>();
    }

    public T get(int position) {
        return list.get(position);
    }

    public int size() {
        return list.size();
    }

    public void add(T t) {
        list.add(t);
        addListener();
    }

    public void remove(T t) {
        list.remove(t);
        addListener();
    }

    public void addAll(List<T> list1) {
        list.addAll(list1);
        addListener();
    }


    private void addListener() {
        if (listener!=null) {
            listener.onChange();
        }
    }

    public void setChangeListener(TeaChangeListListener listener1) {
        this.listener = listener1;
    }

}
