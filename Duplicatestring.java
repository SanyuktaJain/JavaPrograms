package Jan2125;

public class Duplicatestring { 
    public static void main(String[] args) {
        String str = "Great Responsibilities";
        char[] ch = str.toCharArray(); // Correct method to convert to a char array
        
        System.out.println("Duplicate characters in the string are:");
        for (int i = 0; i < ch.length; i++) 
        {
            if (ch[i] == ' ' || ch[i] == '0') 
            { // Skip spaces
                continue;
            }
            for (int j = i + 1; j < ch.length; j++)
            {
                if (ch[i] ==ch[j])
                {
                    System.out.print(ch[i] + " ");
                    ch[j] = '0'; // Mark this character as visited
                }
            }
        }}
    }