package lesson_172;

public class Lessons {

    private String title;
    private String instructions;
    private String text;

    public Lessons(String title, String instrucions, String text) {
        this.title = title;
        this.instructions = instructions;
        this.text = text;
    }

    public String get_title() {
        if (title != null) return title;
        else return "Title";
    }

    public String get_instructions() {
        if (instructions != null) return instructions;
        else return "Instructions";
    }

    public String get_text() {
        if (text != null) return text;
        else return "Text";
    }
}

