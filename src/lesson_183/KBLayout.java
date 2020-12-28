package lesson_183;

//Урок №183. Создание класса KBLayout (Часть 1)

import lesson_174.KeyCode;
import lesson_175.Finger;
import lesson_176.KeyShiftState;
import lesson_177.GlyphGroup;
import lesson_178.Glyph;

import java.util.Hashtable;
import java.util.Vector;

public class KBLayout {
    private Vector keymap_table = new Vector();
    private Hashtable glyphs_by_char = new Hashtable();
    private Hashtable glyphs_by_keycode = new Hashtable();

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

       // this.append(new Glyph(c, keycode, shiftstate,finger,glyphgroup));
    }
}
