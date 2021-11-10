package CoreJavaAssignment;

public class Dollar {
	public static void main(String args[]) {
       
        String str="java vowel replace program ";
        char ch[]=str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$'; //replacing $ in the place of vowels
               }   
        }
        for (int i = 0; i < ch.length; i++) 
        {
            System.out.print(ch[i]);
        }

}
}