package lesson_185;

import lesson_174.KeyCode;

import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import java.awt.*;
import java.awt.event.ActionListener;

//Урок №185. Определяем некоторые переменные (Часть 1)
//public class KeyboardGUI extends JInternalFrame implements Runnable, ActionListener, InternalFrameListener {
public class KeyboardGUI{
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

    public KeyboardGUI() {
    }
}
