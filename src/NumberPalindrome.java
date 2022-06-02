public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int input = number;
        int reverse = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }

        if (input == reverse){
            return true;
        }else{
            return false;
        }

    }
}
