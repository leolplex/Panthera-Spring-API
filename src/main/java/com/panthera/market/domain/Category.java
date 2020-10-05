package com.panthera.market.domain;

public class Category {
    private int ctegoryId;
    private String ctegory;
    private boolean active;

    public int getCtegoryId() {
        return ctegoryId;
    }

    public void setCtegoryId(int ctegoryId) {
        this.ctegoryId = ctegoryId;
    }

    public String getCtegory() {
        return ctegory;
    }

    public void setCtegory(String ctegory) {
        this.ctegory = ctegory;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
