package sg.edu.rp.c346.id21005739.demodatabasecrud;

import java.io.Serializable;

class Note implements Serializable {

    private 	int id;
    private 	String noteContent;

    public Note( int id, String noteContent  ) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {  return id;  }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public String toString() { return "ID:" + id + ", " + noteContent;  }

}
