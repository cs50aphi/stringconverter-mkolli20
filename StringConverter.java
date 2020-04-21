public class StringConverter
{
    public static String reverse(String str)
    {
       String reversed = "";

       for (int i = str.length() - 1; i >= 0; i--)
       {
           reversed = reversed + str.charAt(i);
       }
       return reversed;
    }

    public static boolean checkPalindrome(String str)
    {
        String letters = "";

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (Character.isLetter(c))
            {
                letters = letters + c;
            }
        }

        letters = letters.toLowerCase();

        if (letters.equals(reverse(letters)))
        {
            return true;
        }
        return false;

    }
    public static String pigLatinate(String str)
    {

        int firstVowel = 0;
        String letters = "";


        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (Character.isLetter(c))
            {
                letters = letters + c;
            }
        }

        if (isVowel(letters.charAt(0)))
        {
            return letters + "yay";
        }

        for(int i = 1; i < letters.length(); i++)
        {
            if(isVowel(letters.charAt(i)))
            {
                firstVowel = i;
                break;
            }
        }

        if (firstVowel > 0)
        {

            String answer = letters.substring(firstVowel, letters.length()) + letters.substring(0, firstVowel) + "ay";
            answer = answer.toLowerCase();

            if (Character.isUpperCase(str.charAt(0)))
            {
                answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
            }
            return answer;
        }

        return "You must construct aditional pylons!";

    }

    public static boolean isVowel(char c)
    {
            if (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
        {
            return true;
        }
        return false;
    }

    public static String shorthand(String str)
    {
        String answer = str.replaceAll(" and ", " & ").replaceAll(" to ", " 2 ").replaceAll("you", "U").replaceAll("for", "4").replaceAll("a","").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "");
        return answer;
    }

}