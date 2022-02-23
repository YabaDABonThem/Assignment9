// Allen Bao
// CS 211
// Instructor: Craig Niiyama
// 2/22/2022
// A class to test the methods written in LinkedIntList.java

// I don't know why these file names are offset by 1, it's mildly infuriating tbh.
public class Assignment8 {
    public static void main(String[] args) {
        testLastIndexOf();
        testCountDuplicates();
        testHasTwoConsecutive();
        testDeleteBack();
    }

    public static void testLastIndexOf() {
        LinkedIntList l = new LinkedIntList(1, 18, 2, 7, 18, 39, 18, 40);
        System.out.println(l.toStringShort());
        int target = 18;
        System.out.println("Target: " + target + "\nIndex: " + l.lastIndexOf(target));
        target = 3;
        System.out.println("Target: " + target + "\nIndex: " + l.lastIndexOf(target));
        System.out.println();
    }

    public static void testCountDuplicates() {
        LinkedIntList l = new LinkedIntList(1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40);
        System.out.println(l.toStringShort());
        System.out.println("Number of Duplicates: " + l.countDuplicates());
        System.out.println();
    }

    public static void testHasTwoConsecutive() {
        LinkedIntList l = new LinkedIntList(1, 18, 2, 7, 8, 39, 18, 40);
        System.out.println(l.toStringShort());
        System.out.println(l.hasTwoConsecutive());
        l = new LinkedIntList(1, 18, 17, 2, 7, 39, 18, 40, 8);
        System.out.println(l.toStringShort());
        System.out.println(l.hasTwoConsecutive());
        System.out.println();
    }

    public static void testDeleteBack() {
        LinkedIntList l = new LinkedIntList(1, 2, 3, 4, 5);
        System.out.println(l.toStringShort());
        l.deleteBack();
        System.out.println(l.toStringShort());
        System.out.println();
    }
}
