package previews;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() { return this.id; }
    public String name() { return this.name; }

    @Override
    public String toString() {
        return String.format("Person[id=%d, name=%s]", id, name);
    }
}