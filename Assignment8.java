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
    }

    public static void testLastIndexOf() {
        LinkedIntList l = new LinkedIntList(1, 18, 2, 7, 18, 39, 18, 40);
        int target = 18;
        System.out.println("Target: " + target + "\nIndex: " + l.lastIndexOf(target));
        target = 3;
        System.out.println("Target: " + target + "\nIndex: " + l.lastIndexOf(target));
    }

    public static void testCountDuplicates() {
        
    }
}
