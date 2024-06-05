public class Breaks_Continue {
    public static void main(String args[]){

      //for loop 
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
          }

          for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }


          //while loop

          int a = 0;
          while (a<10) {
            System.out.println(a);
            a++;
            if(a==4){
              continue;
            }
          }
    }
}
