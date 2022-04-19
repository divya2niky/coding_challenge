import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
  public static void main(String[] args){
      HashMap<String,Integer> map = new HashMap<>();
      map.put("I",1);
      map.put("V",5);
      map.put("X",10);
      map.put("L",50);
      map.put("C",100);
      map.put("D",500);
      map.put("M",1000);

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number");


      Integer number = scanner.nextInt();
      for(Map.Entry<String,Integer> e: map.entrySet()){
          if(e.getValue().equals(number)){
              System.out.println("Number is "+e.getKey()+" value"+e.getValue());
          }
      }
     // System.out.println("Number is: "+ number);

  }
}
