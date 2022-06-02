/*
Write a method called isPalindrome with one int parameter called number
the method needs to return a boolean
it should return true if the number is a palindrome number. otherwise return false.
TIP: a palindrome number is a number which when reversed is equal to the original number, for example 121, 12321 etc.
TIP find the reverse of the given number, store it in a variable named reverse. Compare the number with reverse.
Extract the last digit of the given number by performing modulo division
store last digit to variable lastDigit
increase the place value of reverse by one by multiplying variable by 10. reverse = reverse * 10
add lastDigit to reverse
since the last digit of a number is processed, remove the last digit of num by dividing by 10
repeat until number is <= 0
be careful with negative numbers, they can also be palindrome numbers
be careful with reversing a number, you will need a parameter for comparing the reversed number with the starting number.



 */
public class Main {
    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(12321));
    }
}
