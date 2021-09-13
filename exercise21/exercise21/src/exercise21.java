import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the month:");
        String month = input.next();
        int convMonth = Integer.parseInt(month);

        String nameMonth;
        switch (convMonth) {
            case 1:  nameMonth = "January";
                break;
            case 2:  nameMonth = "February";
                break;
            case 3:  nameMonth = "March";
                break;
            case 4:  nameMonth = "April";
                break;
            case 5:  nameMonth = "May";
                break;
            case 6:  nameMonth = "June";
                break;
            case 7:  nameMonth = "July";
                break;
            case 8:  nameMonth = "August";
                break;
            case 9:  nameMonth = "September";
                break;
            case 10: nameMonth = "October";
                break;
            case 11: nameMonth = "November";
                break;
            case 12: nameMonth = "December";
                break;
            default: nameMonth = "Invalid month";
                break;
        }
        System.out.println("The name of the month is "+nameMonth+".");
    }
}
