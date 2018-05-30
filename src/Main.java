public class Main {
    int[] ints;
    private  int x  = 0;
    public static void main(String[] args) {
        Main main = new Main();
        main.print(5);
        System.out.println(main.x);


    }
    private void print(int x){
        this.x = x;
        System.out.println(x);
    }

   public int init (int[] ints){
       for (int i = 0; i < ints.length; i++) {

           ints[i] = i;

       }
       return ints[ints.length];
   }

}
