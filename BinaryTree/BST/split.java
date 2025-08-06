public class split {
    public static void main(String[] args) {
        String s1 ="John";
        String s2 ="Johny";
        String s3 ="Janardhan";

        String a ="";
        String b ="";
        String c ="";

       String[] arr = {s1,s2,s3};
       
       
       
       for(String i: arr){
            if(i.length()%3 == 1){
                a = a +i.charAt(0);
                b = b +i.substring(1,i.length()-1);
                c = c +i.charAt(i.length()-1);
            }
            else if(i.length()%3 == 2){
                a = a + i.substring( 0, 2 );
                b = b +i.substring(2,i.length()-2);
                c = c + i.substring( i.length()%3 + 1, i.length() );
            }
            else{
                int len =i.length()/3;
                a = a + i.substring(0,len);
                b = b + i.substring(len , i.length()- (len-1));
                c = c + i.substring(i.length()-len-1,i.length());
            }
       }
       System.out.println("s1 = "+a);
       System.err.println("s2 = "+b);
       System.out.println("s3 = "+c);

    }
}
