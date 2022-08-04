package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int qtyToPrint = 0;
        int length = cathetusLength;
        for (int y = 1; y <= cathetusLength; y++) {
            int digitsToPrint = y;
            for (int x = 1; x <= length; x++) {
                if (x > (cathetusLength - y)) {
                    if (x == cathetusLength) {
                        System.out.print(1);
                    }
                    else {
                        if (x < cathetusLength) {
                            System.out.print(digitsToPrint);
                            digitsToPrint -= 1;
                        }
                        else {
                            digitsToPrint += 1;
                            System.out.print(digitsToPrint);
                        }
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            length += 1;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
