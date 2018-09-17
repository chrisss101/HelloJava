public class isPalindrome(String str1) {
    String newStr = "";
    for (int i = str1.length; i >= 0; i-- ) {
            newStr = newStr + str1(i);
        }
        if (str1 == newStr){
            return true;
        }
        else {
            return false;
        }
}
