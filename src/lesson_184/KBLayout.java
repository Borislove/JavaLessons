package lesson_184;

//Урок №184. Создание класса KBLayout (Часть 2)

import lesson_174.KeyCode;
import lesson_175.Finger;
import lesson_176.KeyShiftState;
import lesson_177.GlyphGroup;
import lesson_178.Glyph;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class KBLayout {
    private Vector keymap_table = new Vector();
    private Hashtable glyphs_by_char = new Hashtable();
    private Hashtable glyphs_by_keycode_by_shiftstate = new Hashtable();

    public KBLayout(){
        create_glyphs ("`", "KC_01", "UNSHIFTED", "LH_PINKY", "FIGURES");
        create_glyphs ("!", "KC_2", "SHIFTED", "LH_PINKY", "FIGURES");
        create_glyphs ("@", "KC_3", "SHIFTED", "LH_RING", "FIGURES");
        create_glyphs ("#", "KC_4", "SHIFTED", "LH_MIDDLE", "FIGURES");
        create_glyphs ("$", "KC_5", "SHIFTED", "LH_INDEX", "FIGURES");
        create_glyphs ("%", "KC_6", "SHIFTED", "LH_INDEX", "FIGURES");
        create_glyphs ("^", "KC_7", "SHIFTED", "LH_INDEX", "FIGURES");
        create_glyphs ("&", "KC_8", "SHIFTED", "RH_INDEX", "FIGURES");
        create_glyphs ("*", "KC_9", "SHIFTED", "RH_INDEX", "FIGURES");
        create_glyphs ("(", "KC_10", "SHIFTED", "RH_MIDDLE", "FIGURES");
        create_glyphs (")", "KC_11", "SHIFTED", "RH_RING", "FIGURES");
        create_glyphs ("-", "KC_12", "UNSHIFTED", "RH_PINKY", "FIGURES");
        create_glyphs ("=", "KC_13", "UNSHIFTED", "RH_PINKY", "FIGURES");
        create_glyphs ("BACKSPACE", "KC_14", "UNSHIFTED", "RH_PINKY", "FIGURES");

        create_glyphs ("q", "KC_16", "UNSHIFTED", "LH_PINKY", "UNSHIFTED_ALPHA");
        create_glyphs ("w", "KC_17", "UNSHIFTED", "LH_RING", "UNSHIFTED_ALPHA");
        create_glyphs ("e", "KC_18", "UNSHIFTED", "LH_MIDDLE", "UNSHIFTED_ALPHA");
        create_glyphs ("r", "KC_19", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("t", "KC_20", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("y", "KC_21", "UNSHIFTED", "RH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("u", "KC_22", "UNSHIFTED", "RH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("i", "KC_23", "UNSHIFTED", "RH_MIDDLE", "UNSHIFTED_ALPHA");
        create_glyphs ("o", "KC_24", "UNSHIFTED", "RH_RING", "UNSHIFTED_ALPHA");
        create_glyphs ("p", "KC_25", "UNSHIFTED", "RH_PINKY", "UNSHIFTED_ALPHA");
        create_glyphs ("[", "KC_26", "UNSHIFTED", "RH_PINKY", "BASIC");
        create_glyphs ("]", "KC_27", "UNSHIFTED", "RH_PINKY", "BASIC");

        create_glyphs ("a", "KC_28", "UNSHIFTED", "LH_PINKY", "UNSHIFTED_ALPHA");
        create_glyphs ("s", "KC_29", "UNSHIFTED", "LH_RING", "UNSHIFTED_ALPHA");
        create_glyphs ("d", "KC_30", "UNSHIFTED", "LH_MIDDLE", "UNSHIFTED_ALPHA");
        create_glyphs ("f", "KC_31", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("g", "KC_32", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("h", "KC_33", "UNSHIFTED", "RH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("j", "KC_34", "UNSHIFTED", "RH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("k", "KC_35", "UNSHIFTED", "RH_MIDDLE", "UNSHIFTED_ALPHA");
        create_glyphs ("l", "KC_36", "UNSHIFTED", "RH_RING", "UNSHIFTED_ALPHA");
        create_glyphs (";", "KC_37", "UNSHIFTED", "RH_PINKY", "BASIC");
        create_glyphs ("'", "KC_38", "UNSHIFTED", "RH_PINKY", "BASIC");

        create_glyphs ("z", "KC_39", "UNSHIFTED", "LH_RING", "UNSHIFTED_ALPHA");
        create_glyphs ("x", "KC_40", "UNSHIFTED", "LH_MIDDLE", "UNSHIFTED_ALPHA");
        create_glyphs ("c", "KC_41", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("v", "KC_42", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("b", "KC_43", "UNSHIFTED", "LH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("n", "KC_44", "UNSHIFTED", "RH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs ("m", "KC_45", "UNSHIFTED", "RH_INDEX", "UNSHIFTED_ALPHA");
        create_glyphs (",", "KC_46", "UNSHIFTED", "RH_MIDDLE", "BASIC");
        create_glyphs (".", "KC_47", "UNSHIFTED", "RH_RING", "BASIC");
        create_glyphs ("/", "KC_48", "UNSHIFTED", "RH_PINKY", "BASIC");
        create_glyphs ("Shift", "KC_49", "UNSHIFTED", "LH_PINKY", "BASIC");

        create_glyphs ("Q", "KC_16", "SHIFTED", "LH_PINKY", "SHIFTED_ALPHA");
        create_glyphs ("W", "KC_17", "SHIFTED", "LH_RING", "SHIFTED_ALPHA");
        create_glyphs ("E", "KC_18", "SHIFTED", "LH_MIDDLE", "SHIFTED_ALPHA");
        create_glyphs ("R", "KC_19", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("T", "KC_20", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("Y", "KC_21", "SHIFTED", "RH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("U", "KC_22", "SHIFTED", "RH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("I", "KC_23", "SHIFTED", "RH_MIDDLE", "SHIFTED_ALPHA");
        create_glyphs ("O", "KC_24", "SHIFTED", "RH_RING", "SHIFTED_ALPHA");
        create_glyphs ("P", "KC_25", "SHIFTED", "RH_PINKY", "SHIFTED_ALPHA");
        create_glyphs ("{", "KC_26", "SHIFTED", "RH_PINKY", "BASIC");
        create_glyphs ("}", "KC_27", "SHIFTED", "RH_PINKY", "BASIC");

        create_glyphs ("A", "KC_28", "SHIFTED", "LH_PINKY", "SHIFTED_ALPHA");
        create_glyphs ("S", "KC_29", "SHIFTED", "LH_RING", "SHIFTED_ALPHA");
        create_glyphs ("D", "KC_30", "SHIFTED", "LH_MIDDLE", "SHIFTED_ALPHA");
        create_glyphs ("F", "KC_31", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("G", "KC_32", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("H", "KC_33", "SHIFTED", "RH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("J", "KC_34", "SHIFTED", "RH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("K", "KC_35", "SHIFTED", "RH_MIDDLE", "SHIFTED_ALPHA");
        create_glyphs ("L", "KC_36", "SHIFTED", "RH_RING", "SHIFTED_ALPHA");
        create_glyphs (":", "KC_37", "SHIFTED", "RH_PINKY", "BASIC");
        create_glyphs ("", "KC_38", "SHIFTED", "RH_PINKY", "BASIC");

        create_glyphs ("Z", "KC_39", "SHIFTED", "LH_RING", "SHIFTED_ALPHA");
        create_glyphs ("X", "KC_40", "SHIFTED", "LH_MIDDLE", "SHIFTED_ALPHA");
        create_glyphs ("C", "KC_41", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("V", "KC_42", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("B", "KC_43", "SHIFTED", "LH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("N", "KC_44", "SHIFTED", "RH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("M", "KC_45", "SHIFTED", "RH_INDEX", "SHIFTED_ALPHA");
        create_glyphs ("<", "KC_46", "SHIFTED", "RH_MIDDLE", "BASIC");
        create_glyphs (">", "KC_47", "SHIFTED", "RH_RING", "BASIC");
        create_glyphs ("?", "KC_48", "SHIFTED", "RH_PINKY", "BASIC");

        create_glyphs ("NUM_7", "KC_50", "UNSHIFTED", "RH_INDEX", "NUMERIC");
        create_glyphs ("NUM_8", "KC_51", "UNSHIFTED", "RH_MIDDLE", "NUMERIC");
        create_glyphs ("NUM_9", "KC_52", "UNSHIFTED", "RH_RING", "NUMERIC");
        create_glyphs ("NUM_4", "KC_53", "UNSHIFTED", "RH_INDEX", "NUMERIC");
        create_glyphs ("NUM_5", "KC_54", "UNSHIFTED", "RH_MIDDLE", "NUMERIC");
        create_glyphs ("NUM_6", "KC_55", "UNSHIFTED", "RH_RING", "NUMERIC");
        create_glyphs ("NUM_1", "KC_56", "UNSHIFTED", "RH_INDEX", "NUMERIC");
        create_glyphs ("NUM_2", "KC_57", "UNSHIFTED", "RH_MIDDLE", "NUMERIC");
        create_glyphs ("NUM_3", "KC_58", "UNSHIFTED", "RH_RING", "NUMERIC");
        create_glyphs ("NUM_0", "KC_59", "UNSHIFTED", "RH_THUMB", "NUMERIC");

        create_glyphs ("SPACE", "KC_60", "UNSHIFTED", "RH_THUMB", "BASIC");
        create_glyphs ("LEFT_SHIFT", "KC_61", "UNSHIFTED", "LH_PINKY", "BASIC");
        create_glyphs ("RIGHT_SHIFT", "KC_62", "UNSHIFTED", "RH_PINKY", "BASIC");
        create_glyphs ("LEFT_ALT", "KC_63", "UNSHIFTED", "LH_THUMB", "BASIC");
        create_glyphs ("RIGHT_ALT", "KC_64", "UNSHIFTED", "RH_THUMB", "BASIC");
    }

    private void create_glyphs(String s_char, String s_keycode, String s_shiftstate, String s_finger, String s_glyphgroup) {
        char c;
        if (s_char.charAt(0) == '\\') {

            try {
                c = (char) (Integer.parseInt(s_char.substring(1), 8));
            } catch (NumberFormatException e) {

            }
        } else c = s_char.charAt(0);
        KeyCode keycode = KeyCode.find_keycode(s_keycode.toUpperCase());
        KeyShiftState shiftstate = KeyShiftState.find_keyshitfstate(s_shiftstate.toUpperCase());
        Finger finger = Finger.find_finger(s_finger.toUpperCase());
        GlyphGroup glyphgroup = GlyphGroup.find_glyph_group(s_glyphgroup.toUpperCase());

        this.append(new Glyph('c', keycode, shiftstate, finger, glyphgroup));
    }

    public void append(Glyph glyph) {
        keymap_table.addElement(glyph);
        glyphs_by_char.put(glyph.get_character(), glyph);
        Hashtable hashtable = get_table(glyph.get_shiftstate());
        hashtable.put(glyph.get_keycode(), glyph);
    }

    private Hashtable get_table(KeyShiftState shiftstate) {
        Hashtable hashtable = (Hashtable) (glyphs_by_keycode_by_shiftstate.get(shiftstate));
        if (hashtable == null) {
            hashtable = new Hashtable();
            glyphs_by_keycode_by_shiftstate.put(shiftstate, hashtable);
        }
        return hashtable;
    }

    public Enumeration get_elements() {
        return (keymap_table.elements());
    }

    public Glyph find_glyph(char character) {
        return ((Glyph) glyphs_by_char.get(new Character(character)));
    }

    public Glyph find_glyph(KeyCode keycode, KeyShiftState shiftstate) {
        Hashtable hashtable = get_table(shiftstate);
        return ((Glyph) hashtable.get(keycode));
    }
}
