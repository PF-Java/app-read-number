import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number: ");
        int number = scanner.nextInt();
        String readNumber = "";

        System.out.print("Number " + number + " read is ");
        switch (number) {
            case 0:
                readNumber = "Zero";
                break;
            case 1:
                readNumber = "One";
                break;
            case 2:
                readNumber = "Two";
                break;
            case 3:
                readNumber = "Three";
                break;
            case 4:
                readNumber = "Four";
                break;
            case 5:
                readNumber = "Five";
                break;
            case 6:
                readNumber = "Six";
                break;
            case 7:
                readNumber = "Seven";
                break;
            case 8:
                readNumber = "Eight";
                break;
            case 9:
                readNumber = "Night";
                break;
        }

        if (10 <= number && number < 20) {

            switch (number) {
                case 10:
                    readNumber = "Ten";
                    break;
                case 11:
                    readNumber = "Eleven";
                    break;
                case 12:
                    readNumber = "Twelve";
                    break;
                case 13:
                    readNumber = "Thirteen";
                    break;
                case 15:
                    readNumber = "Fifteen";
                    break;
                case 18:
                    readNumber = "Eighteen";
                    break;
                default:{
                    number = number % 10;
                    switch (number) {
                        case 4:
                            readNumber = "Four";
                            break;
                        case 6:
                            readNumber = "Six";
                            break;
                        case 7:
                            readNumber = "Seven";
                            break;
                        case 9:
                            readNumber = "Nine";
                            break;
                    }
                    readNumber = readNumber + "teen.";
                }
            }
        }
        System.out.println(readNumber);
    }
}
