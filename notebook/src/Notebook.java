public class Notebook {
    String[] notes = new String[1000];
    int count = 0;

    void addNote(String note) {
        notes[count] = note;
        count++;
    }

    int getSize() {
        return count;
    }

    void listAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("No " + i + ": " + notes[i]);
        }
    }

    String getNote(int index) {
        return notes[index];
    }

    void removeNote(int index) {
        for (int i = index; i < count - 1; i++) {
            notes[index] = notes[index + 1];
        }
        notes[count - 1] = null;
        count--;
    }

    public static void main(String[] args) {

    }
}
