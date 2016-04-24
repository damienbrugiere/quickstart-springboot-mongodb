package com.spring.boot.beans;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by damien on 23/04/2016.
 */
@Document(collection = "Test")
public class Test {
    @Id
    private String id;
    private String text;

    public Test() {
    }

    public Test(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
