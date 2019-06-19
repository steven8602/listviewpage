package com.example.dlarb.realviewpager;


public class Data {
    public Data(String title, String content) {
        this.title=title;
        this.content=content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String title;
    String content;
}
