package lesson_194;

import lesson_174.KeyCode;
import lesson_175.Finger;
import lesson_176.KeyShiftState;
import lesson_178.Glyph;
import lesson_180.FingerIcon;
import lesson_182.KeyIcon;
import lesson_184.KBLayout;

import javax.swing.*;
import javax.swing.event.InternalFrameEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.Enumeration;
import java.util.Hashtable;

//Урок №194. Java. Переопределяем метод setVisible
//public class KeyboardGUI extends JInternalFrame implements Runnable, ActionListener, InternalFrameListener {

public class KeyboardGUI {
    private static final KeyCode ROW_1_KEY1 = KeyCode.KC_41;
    private static final KeyCode[] ROW_1_SEQ = {
            KeyCode.KC_2, KeyCode.KC_3, KeyCode.KC_4,
            KeyCode.KC_5, KeyCode.KC_6, KeyCode.KC_7,
            KeyCode.KC_8, KeyCode.KC_9, KeyCode.KC_10,
            KeyCode.KC_11, KeyCode.KC_12, KeyCode.KC_13};

    private static final KeyCode ROW_1_BACKSPACE = KeyCode.KC_14;
    private static final KeyCode ROW_2_TAB = KeyCode.KC_15;
    private static final KeyCode[] ROW_2_SEQ = {
            KeyCode.KC_16, KeyCode.KC_17, KeyCode.KC_18,
            KeyCode.KC_19, KeyCode.KC_20, KeyCode.KC_21,
            KeyCode.KC_22, KeyCode.KC_23, KeyCode.KC_24,
            KeyCode.KC_25, KeyCode.KC_26, KeyCode.KC_27};
    private static final KeyCode ROW_2_KEY14 = KeyCode.KC_43;
    private static final KeyCode ROW_3_CAPSLOCK = KeyCode.KC_58;
    private static final KeyCode[] ROW_3_SEQ = {
            KeyCode.KC_30, KeyCode.KC_31, KeyCode.KC_32,
            KeyCode.KC_33, KeyCode.KC_34, KeyCode.KC_35,
            KeyCode.KC_36, KeyCode.KC_37, KeyCode.KC_38,
            KeyCode.KC_39, KeyCode.KC_40};
    private static final KeyCode ROW_3_ENTER = KeyCode.KC_28;
    private static final KeyCode ROW_4_LEFT_SHIFT = KeyCode.KC_42;
    private static final KeyCode[] ROW_4_SEQ = {
            KeyCode.KC_44, KeyCode.KC_45, KeyCode.KC_46,
            KeyCode.KC_47, KeyCode.KC_48, KeyCode.KC_49,
            KeyCode.KC_50, KeyCode.KC_51, KeyCode.KC_52,
            KeyCode.KC_53};
    private static final KeyCode ROW_4_RIGHT_SHIFT = KeyCode.KC_54;
    private static final KeyCode ROW_5_LEFT_CTRL = KeyCode.KC_29;
    private static final KeyCode ROW_5_LEFT_ALT = KeyCode.KC_56;
    private static final KeyCode ROW_5_SPACE = KeyCode.KC_57;
    private static final KeyCode ROW_5_RIGHT_ALT = KeyCode.KC_100;
    private static final KeyCode ROW_5_RIGHT_CTRL = KeyCode.KC_97;

    private static final KeyCode NUM_NUMLOCK = KeyCode.KC_69;
    private static final KeyCode NUM_SLASH = KeyCode.KC_98;
    private static final KeyCode NUM_ASTERISK = KeyCode.KC_55;
    private static final KeyCode NUM_MINUS = KeyCode.KC_74;
    private static final KeyCode NUM_7 = KeyCode.KC_71;
    private static final KeyCode NUM_8 = KeyCode.KC_72;
    private static final KeyCode NUM_9 = KeyCode.KC_73;
    private static final KeyCode NUM_4 = KeyCode.KC_75;
    private static final KeyCode NUM_5 = KeyCode.KC_76;
    private static final KeyCode NUM_6 = KeyCode.KC_77;
    private static final KeyCode NUM_PLUS = KeyCode.KC_78;
    private static final KeyCode NUM_1 = KeyCode.KC_79;
    private static final KeyCode NUM_2 = KeyCode.KC_80;
    private static final KeyCode NUM_3 = KeyCode.KC_81;
    private static final KeyCode NUM_0 = KeyCode.KC_82;
    private static final KeyCode NUM_PERIOD = KeyCode.KC_83;
    private static final KeyCode NUM_ENTER = KeyCode.KC_96;

    private static final Color COLOR_PANEL = Color.LIGHT_GRAY;
    private static final Color COLOR_NEUTRAL = Color.GRAY;
    private static final Color COLOR_EXPECTED = Color.BLUE;
    private static final Color COLOR_SUCCESS = Color.GREEN;
    private static final Color COLOR_ERROR = Color.RED;

    private static final Color COLOR_LH_PINKY = Color.CYAN;
    private static final Color COLOR_LH_RING = Color.MAGENTA;
    private static final Color COLOR_LH_MIDDLE = Color.ORANGE;
    private static final Color COLOR_LH_INDEX = Color.PINK;

    private static final Color COLOR_RH_PINKY = Color.CYAN;
    private static final Color COLOR_RH_RING = Color.MAGENTA;
    private static final Color COLOR_RH_MIDDLE = Color.ORANGE;
    private static final Color COLOR_RH_INDEX = Color.PINK;

    private KBLayout kblayout;

    private Hashtable keyicons_by_keycode = new Hashtable();
    private Hashtable fingericons_by_finger = new Hashtable();
    private Hashtable colors_by_finger = new Hashtable();
    private Hashtable numkeycodes_by_char = new Hashtable();

    private KeyIcon last_expected;
    private KeyIcon num_last_expected;
    private KeyIcon last_error;
    private KeyIcon num_last_error;

    private KeyIcon success_error;
    private KeyIcon success__last_error;

    private long timestamp_error;
    private long timestamp_success;

    private FingerIcon last_expected_finger;

    private KeyIcon left_shift;
    private KeyIcon right_shift;
    private KeyIcon left_alt;
    private KeyIcon right_alt;

    private Object visible = new Object();


    public KeyboardGUI() {
        // this.addInternalFrameListener(this);
        //this.setTitle("Keyboard");
        colors_by_finger.put(Finger.LH_PINKY, COLOR_LH_PINKY);
        colors_by_finger.put(Finger.RH_PINKY, COLOR_RH_PINKY);

        colors_by_finger.put(Finger.LH_RING, COLOR_LH_RING);
        colors_by_finger.put(Finger.RH_RING, COLOR_RH_RING);

        colors_by_finger.put(Finger.LH_MIDDLE, COLOR_LH_MIDDLE);
        colors_by_finger.put(Finger.RH_MIDDLE, COLOR_RH_MIDDLE);

        colors_by_finger.put(Finger.LH_INDEX, COLOR_LH_INDEX);
        colors_by_finger.put(Finger.RH_INDEX, COLOR_RH_INDEX);

        //   JPanel panel = make_kb_panel(); //keyboard
        // getContentPane().add("Center", panel);
        JLabel kbtype_label = new JLabel("US", JLabel.RIGHT);
        //getContentPane().add("South", kbtype_label);

        left_shift = (KeyIcon) keyicons_by_keycode.get(ROW_4_LEFT_SHIFT);
        right_shift = (KeyIcon) keyicons_by_keycode.get(ROW_4_RIGHT_SHIFT);

        left_alt = (KeyIcon) keyicons_by_keycode.get(ROW_5_LEFT_ALT);
        right_alt = (KeyIcon) keyicons_by_keycode.get(ROW_5_RIGHT_ALT);

        numkeycodes_by_char.put(new Character('/'), NUM_SLASH);
        numkeycodes_by_char.put(new Character('*'), NUM_ASTERISK);
        numkeycodes_by_char.put(new Character('-'), NUM_MINUS);
        numkeycodes_by_char.put(new Character('7'), NUM_7);
        numkeycodes_by_char.put(new Character('8'), NUM_8);
        numkeycodes_by_char.put(new Character('9'), NUM_9);
        numkeycodes_by_char.put(new Character('4'), NUM_4);
        numkeycodes_by_char.put(new Character('5'), NUM_5);
        numkeycodes_by_char.put(new Character('6'), NUM_6);
        numkeycodes_by_char.put(new Character('+'), NUM_PLUS);
        numkeycodes_by_char.put(new Character('1'), NUM_1);
        numkeycodes_by_char.put(new Character('2'), NUM_2);
        numkeycodes_by_char.put(new Character('3'), NUM_3);
        numkeycodes_by_char.put(new Character('0'), NUM_0);
        numkeycodes_by_char.put(new Character('.'), NUM_PERIOD);
        numkeycodes_by_char.put(new Character('\n'), NUM_ENTER);

   /* colorize_keyicond();
    colorize_fingericons();
    display_legends();*/
        //   new Thread(this, "KeyboardGUI_timeout").start();
    }
   /* public void run(){
        final int THREAD_TICK = 250;
        final int HIGHLIGHT_TIMEOUT = 250;

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        while (true){
            while (!isVisible()){
                try{
                    synchronized (visible){
                        visible.wait();
                    }
                }catch (InterruptedException e){

                }
            }
            try{
                Thread.sleep(THREAD_TICK);
            }catch (InterruptedException e){
                long now = System.currentTimeMillis();
                if((now - timestamp_error) >= HIGHLIGHT_TIMEOUT)clear_error();
            }

        }
    }*/

    private KeyIcon new_keyicon(String default_legend, int width_factor, KeyCode keycode) {
        Glyph glyph = kblayout.find_glyph(keycode, KeyShiftState.UNSHIFTED);
        if (glyph == null) kblayout.find_glyph(keycode, KeyShiftState.SHFTED);
        if (glyph == null) kblayout.find_glyph(keycode, KeyShiftState.META_ALT);

        String legend = default_legend;

        if (glyph != null) {
            Character character = glyph.get_character();
            if (character.charValue() == '_') legend = "Space";
            else if (character.charValue() == '\n') legend = "Return";
            else legend = character.toString();
        }
        KeyIcon keyicon = new KeyIcon(legend, width_factor);
//        keyicon.set_color(COLOR_NEUTRAL);
        keyicons_by_keycode.put(keycode, keyicon);

        return (keyicon);
    }

    private FingerIcon new_fingericon(String legend, Finger finger) {
        FingerIcon fingericon = new FingerIcon(legend);
        //  fingericon.set_color(COLOR_NEUTRAL);
        fingericons_by_finger.put(finger, fingericon);
        return (fingericon);
    }

    public void colorize_keyicons() {
        for (Enumeration en = kblayout.get_elements(); en.hasMoreElements(); ) {
            Glyph glyph = (Glyph) (en.nextElement());
            KeyCode keycode = glyph.get_keycode();
            Finger finger = glyph.get_finger();
            KeyIcon keyicon = (KeyIcon) (keyicons_by_keycode.get(keycode));
            if (keycode != null) {
                //      keyicon.set_bgcolor(COLOR_PANEL);
            }
        }
    }

    public void colorize_fingericons() {
        for (Enumeration en = Finger.get_elements(); en.hasMoreElements(); ) {
            Finger finger = (Finger) (en.nextElement());
            FingerIcon fingericon = (FingerIcon) (fingericons_by_finger.get(finger));
            if (fingericon != null) {
                Color color = (Color) (colors_by_finger.get(finger));
                //   if (color != null) fingericon.set_color(color);
            }
        }
    }

   /* public void display_legends() {
        for (Enumeration en = keyicons_by_keycode.get_elements(); en.hasMoreElements()) ; {
            KeyIcon keyicon = (KeyIcon) (en.nextElement());
            keyicon.show_legend(true);
        }

        for (Enumeration en = fingericons_by_finger.get_elements(); en.hasMoreElements()) ; {
            FingerIcon fingericon = (FingerIcon) (en.nextElement());
            fingericon.show_legend(true);
        }
    }*/

    private KeyIcon highlight_keyicon(KeyCode keycode, Color color) {
        KeyIcon keyicon = (KeyIcon) (keyicons_by_keycode.get(keycode));
        if (keyicon != null) {
            keyicon.set_highlight(color);
            return (keyicon);
        }
        return (null);
    }

    private KeyIcon highlight_keyicon(Glyph glyph, Color color) {
        return (highlight_keyicon(glyph.get_keycode(), color));
    }

    private KeyIcon highlight_keyicon(char character, Color color) {
        Glyph glyph = kblayout.find_glyph(character);
        if (glyph != null) {
            highlight_keyicon(glyph, color);
        }
        return (null);
    }

    private KeyIcon num_highlight__keyicon(char character, Color color) {
        KeyCode num_keycode = (KeyCode) (numkeycodes_by_char.get(new Character(character)));
        if (num_keycode != null) {
            return (highlight_keyicon(num_keycode, color));
        }
        return null;
    }

    public void char_expected(char character) {
        clear_expected();
        Glyph glyph = kblayout.find_glyph(character);
        if (glyph != null) {
            Finger finger = glyph.get_finger();
            FingerIcon fingericon = (FingerIcon) (fingericons_by_finger.get(finger));
            if (fingericon != null)
                fingericon.set_highlight(COLOR_EXPECTED);
            last_expected_finger = fingericon;
            KeyIcon shifticon = null;
            KeyShiftState keyshiftstate = glyph.get_shiftstate();
            if (keyshiftstate == KeyShiftState.SHFTED)
                if (finger.is_left_handed()) shifticon = right_shift;
                else shifticon = left_shift;
            else if (keyshiftstate == KeyShiftState.META_ALT)
                if (finger.is_left_handed()) shifticon = right_alt;
                else shifticon = right_alt;
            if (shifticon != null)
                shifticon.set_highlight(COLOR_EXPECTED);
            last_expected = highlight_keyicon(glyph, COLOR_EXPECTED);

        }
    }

    public void clear_expected() {
        if (last_expected != null) {
            last_expected.clear_highlight();
            last_expected = null;
        }
        if (num_last_expected != null) {
            num_last_expected.clear_highlight();
            num_last_expected = null;
        }
        left_shift.clear_highlight();
        right_shift.clear_highlight();

        left_alt.clear_highlight();
        right_alt.clear_highlight();
    }

    public void char_error(char character) {
        clear_error();
        last_error = highlight_keyicon(character, COLOR_ERROR);
        num_last_error = num_highlight__keyicon(character, COLOR_ERROR);

        timestamp_error = System.currentTimeMillis();
    }

    public void clear_error() {
        if (last_error != null)
            if (last_error != last_expected) {

                last_error.clear_highlight();
                last_error = null;
            }

        if (num_last_error != null)
            if (num_last_error != last_expected) {

                num_last_error.clear_highlight();
                num_last_error = null;
            }

    }


/*
    public void char_success(char character) {
        clear_success();
        last_success = highlight_keyicon(character, COLOR_SUCCESS);
        num_last_success = num_highlight__keyicon(character, COLOR_SUCCESS);

        if (last_success == last_expected)
            last_expected = null;

        if (num_last_success = num_last_expected) {
            num_last_expected = null;
        }
        timestamp_success = System.currentTimeMillis();
    }

    public void clear_success() {
if(last_success !=null)
    if(last_success !=last_expected){
        last_success.clear_highlight();
        last_success = null;
    }

if(num_last_success !=num.last_expecterd){
    num_last_success.clear_highlight();
    num_last_success = null;
}
    }
}
*/

    public void setVisible(boolean is_visible) {
      //  super.setVisible(is_visible);
        if (is_visible) synchronized (visible) {
            visible.notify();
        }
    }

    private void handle_close_button() {
        setVisible(false);
    }

    public void actionPerformed(ActionEvent evt) {

    }

    public void internalFrameActivated(InternalFrameEvent evt) {

    }

    public void internalFrameClosing(InternalFrameEvent evt) {
        handle_close_button();
    }

    public void internalFrameClosed(InternalFrameEvent evt) {

    }

    public void internalFrameDeactivated(InternalFrameEvent evt){

    }

    public void internalFrameDeiconifed(InternalFrameEvent evt){

    }
    public void internalFrameIconified(InternalFrameEvent evt){

    }

    public void internalFrameOpened(InternalFrameEvent evt){

    }

    public void itemStateChanged(ItemEvent evt){

    }
}