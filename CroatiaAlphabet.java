import java.util.Scanner;

//백준_2941_크로아티아 알파벳
public class CroatiaAlphabet {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        String [] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String word = scan.nextLine();
        word.length();
        for(int i = 0; i < croatia.length; i++)
        {
            word = word.replace(croatia[i], "*");
        }
        System.out.println(word.length());
    }
}