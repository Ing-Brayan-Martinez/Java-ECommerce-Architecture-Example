package com.example.aplication.children;

public class ChildrenQuery {

    public static ChildrenQuery empty() {
        return new ChildrenQuery();
    }

    private String id;

    public ChildrenQuery() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
