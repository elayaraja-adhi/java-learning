public class reversestring {
    public static void main(String[] args) {
        String Org = "ajarayalE";
        String revString = "";
        char ch;

        for(int i=0;i<Org.length();i++) {
            ch = Org.charAt(i);
            revString=ch+revString;
        }
         System.out.println(revString);
    }
}
