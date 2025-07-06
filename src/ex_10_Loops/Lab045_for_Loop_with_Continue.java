package ex_10_Loops;

public class Lab045_for_Loop_with_Continue {
    public static void main(String[] args) {

//CASE 1 - for loop + continue //continue just means skipping
      for (int i=0; i<50; i++){
          if (i==5){
              continue;
          }
          System.out.println(i);
      }
      for (int j = 0; j<=50; j++){
          if (j%2==0){
              continue;
          }
          System.out.println("Odd no ->"+j);
      }
    }
}
