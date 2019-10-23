package assignment01;

public class Exercise1 {
    public int largestNumber(int number) {
        return (int) Math.pow(10, number) - 1;
    }

    public static void main(String[] args) {
        System.out.println("------------- start -------------");
        System.out.println(" largest to 2 = " + new Exercise1().largestNumber(2));
        System.out.println("------------- end -------------");
    }
}