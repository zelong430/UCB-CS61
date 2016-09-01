public class LeapYear{
    public static void main(String[] args){
        int year = 2000;
        String fs = String.format("%d is a leap year/n", year);
        if (year % 400 == 0){
            System.out.println(fs);
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(fs);
        }
    }
}
