package lesson_176;

import java.util.Hashtable;

//Урок №176. Создание класса, обрабатывающего нажатие Shift
public class KeyShiftState {
    private String id;

    public final static KeyShiftState UNSHIFTED = new KeyShiftState("UNSHIFTED");
    public final static KeyShiftState SHFTED = new KeyShiftState("SHIFTED");
    public final static KeyShiftState META_ALT = new KeyShiftState("META_ALT");

    private static Hashtable states_by_name = new Hashtable();

    static {
        states_by_name.put("UNSHIFTED", UNSHIFTED);
        states_by_name.put("SHIFTED", SHFTED);
        states_by_name.put("META_ALT", META_ALT);
    }

    public KeyShiftState(String id) {
        this.id = id;
    }

    public static KeyShiftState find_keyshitfstate(String name) {
        return ((KeyShiftState) (states_by_name.get(name)));
    }

    public String toString() {
        return (id);
    }
}
