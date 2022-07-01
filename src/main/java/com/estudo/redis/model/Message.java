package com.estudo.redis.model;

public class Message {

    private String data;
    private String author;

    public Message(String data, String author) {
        this.data = data;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "data='" + data + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
