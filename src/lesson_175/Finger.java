package lesson_175;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

//Урок №175.Храние информации о пальцах
public class Finger {
    private String id;
    public static final Finger NO_FINGER = new Finger("NO_FINGER");
    //left hand
    public static final Finger LH_THUMB = new Finger("LH_THUMB"); //большой
    public static final Finger LH_INDEX = new Finger("LH_INDEX"); //указательный
    public static final Finger LH_MIDDLE = new Finger("LH_MIDDLE"); //средний
    public static final Finger LH_RING = new Finger("LH_RING"); //безымянный
    public static final Finger LH_PINKY = new Finger("LH_PINKY"); //мизинец
    //righ hand
    public static final Finger RH_THUMB = new Finger("RH_THUMB"); //
    public static final Finger RH_INDEX = new Finger("RH_INDEX"); //
    public static final Finger RH_MIDDLE = new Finger("RH_MIDDLE");
    public static final Finger RH_RING = new Finger("RH_RING");
    public static final Finger RH_PINKY = new Finger("RH_PINKY");

    private static Vector fingers = new Vector();


    private static Hashtable fingers_by_name = new Hashtable();

    static {

        fingers.addElement(LH_PINKY);
        fingers.addElement(RH_PINKY);
        fingers.addElement(LH_RING);
        fingers.addElement(RH_PINKY);
        fingers.addElement(LH_MIDDLE);
        fingers.addElement(RH_MIDDLE);
        fingers.addElement(LH_INDEX);
        fingers.addElement(RH_INDEX);

        //fingers_by_name.put("NO_FINGER", NO_FINGER);

        fingers_by_name.put("LH_PINKY", LH_PINKY);
        fingers_by_name.put("LH_RING", LH_RING);
        fingers_by_name.put("LH_MIDDLE", LH_MIDDLE);
        fingers_by_name.put("LH_INDEX", LH_INDEX);
        fingers_by_name.put("LH_THUMB", LH_THUMB);

        fingers_by_name.put("RH_PINKY", RH_PINKY);
        fingers_by_name.put("RH_RING", RH_RING);
        fingers_by_name.put("RH_MIDDLE", RH_MIDDLE);
        fingers_by_name.put("RH_INDEX", RH_INDEX);
        fingers_by_name.put("RH_THUMB", RH_THUMB);
    }

    public static Enumeration get_elements() {
        return (fingers.elements());
    }

    public Finger(String id) {
        this.id = id;
    }

    public String get_resource_id() {
        return ("Finger." + id);
    }

    public boolean is_left_handed() {
        return (this == LH_PINKY || this == LH_RING || this == LH_MIDDLE || this == LH_INDEX || this == LH_THUMB);
    }

    public boolean is_right_handed() {
        return (this == RH_PINKY || this == RH_RING || this == RH_MIDDLE || this == RH_INDEX || this == RH_THUMB);
    }

    public String toString() {
        return id;
    }

    public static Finger find_finger(String name) {
        return ((Finger) (fingers_by_name.get(name)));
    }

    public static void main(String[] args) {
        System.out.println("**CLASS TEST CODE**");
        System.out.println(LH_PINKY);
        System.out.println(find_finger("LH_PINKY"));
    }
}
