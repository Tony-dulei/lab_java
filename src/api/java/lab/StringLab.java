package lab;

public class StringLab {

    /**
     * Write code to check a String is palindrome or not?
     * 
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        String reverseStr = strBuilder.reverse().toString();
        System.out.println("Reverse string is : " + reverseStr);
        if(reverseStr.equals(str)) {
            return true;
        }
        return false;
    }
// 2. Write a method which will remove any given character from a String?

// 3. Print all permutation of String both iterative and Recursive way?

// 4. Write a function to find out longest palindrome in a given string?

// 5. How to find first non-repeated character of a given String?

// 6. How to count occurrence of a given character in a String?

// 7. How to check if two String are Anagram?

// 8. How to convert numeric String to int in


    public static void main(String[] args) {
        String orginalStr = "hello";

        if(isPalindrome(orginalStr)) {
            System.out.println(orginalStr + " is palindrome");
        } else {
            System.out.println(orginalStr + " is not palindrome");
        }
    }
}
