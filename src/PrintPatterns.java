import java.sql.SQLOutput;

public class PrintPatterns {
    public static void main(String[] args) {

        printPatternA(6);
        System.out.println();
        printPatternB(6);
        System.out.println();
        printPatternC(8);
        System.out.println();
        printPatternD(8);
        System.out.println();
        printPatternE(8);
        System.out.println();
        printPatternF(8);
        System.out.println();
        printPatternG(8);
        System.out.println();
        printPatternH(8);
        System.out.println();
        printPatternI(8);
        System.out.println();
        printPatternJ(8);
        System.out.println();
        printPatternK(6);
        System.out.println();
        printPatternL(6);
        System.out.println();
        printPatternM(8);
        System.out.println();
        printPatternN(8);
        System.out.println();
        printPatternO(8);
        System.out.println();
        printPatternP(8);
        System.out.println();
        printPatternQ(8);
        System.out.println();
        printPatternR(8);
        System.out.println();
        printPatternS(8);
        System.out.println();
        printPatternT(8);
        System.out.println();
        printPatternU(8);
    }

    private static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternE(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternF(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternG(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternH(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1 || col == row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternI(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1 || col == row || col == 1 || col == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternJ(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            for (int i = size; i <= size; i++) {
                for (int j = size - 1; j >= row; j--) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }

    }

    public static void printPatternK(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            for (int i = size; i <= size; i++) {
                for (int col = 2; col <= row; col++) {
                    System.out.print("#  ");
                }
            }
            System.out.println();


        }
    }

    public static void printPatternL(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            for (int i = size; i <= size; i++) {
                for (int col = 2; col <= row; col++) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row + 1; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col > row + 1; col--) {
                System.out.print("#  ");
            }
            for (int i = size; i <= size; i++) {
                for (int j = size - 1; j >= row; j--) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternM(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void printPatternN(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                int number = (size - col) + 1;
                System.out.print(number + "  ");
            }
            System.out.println();
        }
    }

    private static void printPatternO(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print((row - col) + 1 + "  ");
            }
            System.out.println();
        }
    }

    private static void printPatternP(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= row; col--) {
                System.out.print((col - row) + 1 + "  ");
            }
            System.out.println();
        }
    }

    public static void printPatternQ(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "  ");
            }
            for (int i = size; i <= size; i++) {
                for (int col = 2; col <= row; col++) {
                    System.out.print((row - col) + 1 + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternR(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                System.out.print((size - col) + 1 + "  ");
            }
            for (int i = size; i <= size; i++) {
                for (int j = size - 1; j >= row; j--) {
                    System.out.print((j - row) + 1 + "  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternS(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "  ");
            }
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("");
            }
            for (int col = size; col > row; col--) {

                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                System.out.print("");
            }
            for (int diff = size - 2; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {

                System.out.print((row - col) + 1 + "  ");

            }
            System.out.println();
        }
    }

    public static void printPatternT(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= row; col--) {
                System.out.print((size - col) + 1 + "  ");
            }
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("   ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("   ");
            }
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("");
            }
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("");
            }
            for (int col = size; col >= row; col--) {

                System.out.print(col  + "  ");
            }
            System.out.println();
        }
    }
    public static void printPatternU(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(row + "  " );
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + "  ");
            }

            System.out.println();
        }

    }

}









