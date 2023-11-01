package org.example.dao;

import org.example.models.WebNote;

import java.util.ArrayList;
import java.util.List;

public class WebNoteDAO {
    private static int NOTES_COUNT;
    private List<WebNote> notes;

    public WebNoteDAO() {
        notes = new ArrayList<WebNote>();
        notes.add(new WebNote(++NOTES_COUNT, "test1"));
        notes.add(new WebNote(++NOTES_COUNT, "test2"));
        notes.add(new WebNote(++NOTES_COUNT, "test3"));
        notes.add(new WebNote(++NOTES_COUNT, "test4"));
        notes.add(new WebNote(++NOTES_COUNT, "test5"));
    }

    public List<WebNote> index() {
        return notes;
    }

    public WebNote show(int id) {
        return notes.stream()
                .filter(n -> n.getId() == id)
                .findAny().orElse(null);
    }

    public void save(WebNote webNote) {
        webNote.setId(++NOTES_COUNT);
        notes.add(webNote);
    }

    public void update(int id, WebNote updateNote) {
        WebNote toUpdateNote = show(id);
        toUpdateNote.setNote(updateNote.getNote());
    }

    public void delete(int id) {
        notes.removeIf(n -> n.getId() == id);
    }
}
