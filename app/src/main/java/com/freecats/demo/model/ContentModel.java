package com.freecats.demo.model;

/**
 * <br>Created by wbj on 2016/12/30.
 */

public class ContentModel {
    private String text;
    private boolean isShrink;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isShrink() {
        return isShrink;
    }

    public void setShrink(boolean shrink) {
        isShrink = shrink;
    }
}
