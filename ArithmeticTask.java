class ArithmeticTask {

    public static void main(String[] args) {

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        System.out.println((result - 1)); // result is now 2

        System.out.println((result - 1) * 2); // result is now 4

        System.out.println(((result - 1) * 2) / 2); // result is now 2

        result = (((result - 1) * 2) / 2 + 8);

        System.out.println(result % 7);

        // result = result - 1;
        // System.out.println(result);

        // result = result * 2; // result is now 4
        // System.out.println(result);

        // result = result / 2; // result is now 2
        // System.out.println(result);

        // result = result + 8; // result is now 10
        // result = result % 7; // result is now 3
        // System.out.println(result);

    }
}