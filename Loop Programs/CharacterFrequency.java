import java.util.Scanner;
class CharacterFrequency {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char cha = ' ';
        int max = 0;

        for (char i = 'A'; i <= 'Z'; i++) {  
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == i) 
                    cnt++;
            }

            if (cnt > max) {  
                max = cnt;
                cha = i;  
            }
        }

        System.out.println(cha + " is the highest repeating character, occurring " + max + " times.");
    }
}
