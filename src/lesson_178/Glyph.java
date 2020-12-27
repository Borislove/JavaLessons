package lesson_178;

import lesson_174.KeyCode;
import lesson_175.Finger;
import lesson_176.KeyShiftState;
import lesson_177.GlyphGroup;

//Урок №178. Класс для хранения информации о клавишах
public class Glyph {

    private Character character;
    private KeyCode keycode;
    private KeyShiftState shiftstate;
    private Finger finger;
    private GlyphGroup group;

    public Glyph(char character, KeyCode keycode, KeyShiftState shiftstate, Finger finger, GlyphGroup group) {
        this.character = new Character(character);
        this.keycode = (keycode != null) ? keycode : KeyCode.KC_NULL;
        this.shiftstate = (shiftstate != null) ? shiftstate : KeyShiftState.UNSHIFTED;
        this.finger = (finger != null) ? finger : Finger.NO_FINGER;
        this.group = (group != null) ? group : GlyphGroup.NO_GROUP;
    }

    public Character get_character() {
        return (character);
    }

    public KeyCode get_keycode() {
        return (keycode);
    }

    public KeyShiftState get_shiftstate() {
        return (shiftstate);
    }

    public Finger get_finger() {
        return (finger);
    }

    public GlyphGroup get_group() {
        return (group);
    }

    public String toString() {
        return (getClass().getName() + " character = " + character + " keycode = " + keycode + " shiftstate = " + shiftstate + " finger = " + finger + " group = " + group);
    }

    public static void main(String[] args) {
        System.out.println("**CLASS TEST CODE**");
        System.out.println(new Glyph('a', KeyCode.KC_37, KeyShiftState.UNSHIFTED, Finger.LH_PINKY, GlyphGroup.UNSHIFTED_ALPHA));
    }
}
