import java.util.*;

public class GenerateUserId{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String last=sc.next();
        int pinn= sc.nextInt();
        String pin=""+pinn;
        int n=sc.nextInt();
        if(n>pin.length()){
            System.out.print("ERROR");
        }
        String longer="";
        String smaller="";
        if(first.length()==last.length()){
       String longest=(first.compareTo(last)<0)?last:first;
       String smallest=(first.compareTo(last)>0)?last:first;
       longer=longer+longest;
       smaller=smaller+smallest;
        }
        else{
          String longest=(first.length()>last.length()?first:last);
           String smallest=(first.length()>last.length()?last:first);
           longer=longer+longest;
           smaller=smaller+smallest;
        }
        char firstletter=smaller.charAt(smaller.length()-1);
        String secondletter=longer;
      char thirdletter=pin.charAt(n-1);
      char fourthletter=pin.charAt(pin.length()-n);
      String result=(firstletter+secondletter);
      String answer="";
      for(int i=0;i<result.length();i++)
      {
          char c=result.charAt(i);
          if(Character.isUpperCase(c)==true)
          {
               c=Character.toLowerCase(c);
               answer=answer+c;
          }
          else if(Character.isLowerCase(c)==true)
          {
             c=Character.toUpperCase(c);
             answer=answer+c;
          }
      }
      answer=answer+thirdletter+fourthletter;
          if(pin.length()>=n){
              System.out.print(answer);
              
          }
        
        
        
    }
}

