package com.koreait.first.picsum;

public class PicsumVO {
    private String id;
    private String author;
    private int width;
    private int height;
    private String url;
    private String download_url;

    //프라이빗한 멤버필드에 값 넣는 법
    //1. 생성자
    //2. setter메소드
    //값 빼는 법
    //getter 메소드

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }



}
