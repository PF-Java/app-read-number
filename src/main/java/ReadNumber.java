import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number: ");
        int number = scanner.nextInt();
        System.out.print("\nNumber " + number + " read is ");
        String readNumber = "";

        int hangTram = number / 100;
        switch (hangTram) {
            case 1:
                readNumber = "One Hundred ";
                break;
            case 2:
                readNumber = "Two Hundred ";
                break;
            case 3:
                readNumber = "Three Hundred ";
                break;
            case 4:
                readNumber = "Four Hundred ";
                break;
            case 5:
                readNumber = "Five Hundred ";
                break;
            case 6:
                readNumber = "Six Hundred ";
                break;
            case 7:
                readNumber = "Seven Hundred ";
                break;
            case 8:
                readNumber = "Eight Hundred ";
                break;
            case 9:
                readNumber = "Night Hundred ";
                break;
        }

        number = number % 100;
        int hangChuc = number / 10;
            switch (hangChuc) {
                case 2:
                    readNumber += "Twenty ";
                    break;
                case 3:
                    readNumber += "Thirty ";
                    break;
                case 4:
                    readNumber += "Forty ";
                    break;
                case 5:
                    readNumber += "Fifty ";
                    break;
                case 6:
                    readNumber += "Sixty ";
                    break;
                case 7:
                    readNumber += "Seventy ";
                    break;
                case 8:
                    readNumber += "Eighty ";
                    break;
                case 9:
                    readNumber += "Ninety ";
                    break;
            }

        number = number % 10;
        int hangDonVi = number;
        if (hangChuc == 1) {
            switch (hangDonVi) {
                case 0:
                    readNumber += "Ten ";
                    break;
                case 1:
                    readNumber += "Eleven ";
                    break;
                case 2:
                    readNumber += "Twelve ";
                    break;
                case 3:
                    readNumber += "Thirteen ";
                    break;
                case 5:
                    readNumber += "Fifteen ";
                    break;
                case 8:
                    readNumber += "Eighteen ";
                    break;
                case 4:
                    readNumber += "Fourteen ";
                    break;
                case 6:
                    readNumber += "Sixteen ";
                    break;
                case 7:
                    readNumber += "Seventeen ";
                    break;
                case 9:
                    readNumber += "Nineteen ";
                    break;
            }
        } else {
            switch (hangDonVi) {
            case 1:
                readNumber += "One";
                break;
            case 2:
                readNumber += "Two";
                break;
            case 3:
                readNumber += "Three";
                break;
            case 4:
                readNumber += "Four";
                break;
            case 5:
                readNumber += "Five";
                break;
            case 6:
                readNumber += "Six";
                break;
            case 7:
                readNumber += "Seven";
                break;
            case 8:
                readNumber += "Eight";
                break;
            case 9:
                readNumber += "Night";
                break;
            }
        }
        if (number == 0)
            readNumber = "Zero";
        System.out.print(readNumber);
    }
}

