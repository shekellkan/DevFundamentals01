package assignment01;

public class Exercise2 {
    int startPoint = 1;
    int endPoint = 100;

    public int centuryFromYear(int year) {
        int century = 0;
        if (year > 0) {
            century = year % 100 == 0 ? year/100 : year/100 + 1;      
        }        
        return century;
    }

    public static void main(String[] args) {
        System.out.println("------------- start -------------");
        System.out.println(" centuryies in 1905 = " + new Exercise2().centuryFromYear(1905));
        System.out.println(" centuryies in 1700 = " + new Exercise2().centuryFromYear(1700));
        System.out.println(" centuryies in 2000 = " + new Exercise2().centuryFromYear(2000));
        System.out.println(" centuryies in 200 = " + new Exercise2().centuryFromYear(200));
        System.out.println(" centuryies in 100 = " + new Exercise2().centuryFromYear(100));
        System.out.println(" centuryies in 0 = " + new Exercise2().centuryFromYear(0));
        System.out.println("------------- end -------------");
    }
}