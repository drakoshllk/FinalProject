package org.example.models;

public class WebNote {
    private int id;
    private String note;

    public WebNote() {
        this.id = 0;
        this.note = "";
    }

    public WebNote(int id, String note) {
        this.id = id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
