public class constparameter {
        int x;
      
        public constparameter (int y) {
          x = y;
        }
      
        public static void main(String[] args) {
         constparameter  myObj = new constparameter (5);
          System.out.println(myObj.x);
        }
      }
      
