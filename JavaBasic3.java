public class JavaBasic3 {
    public static void main(String[] args){

        for (int i = 6, r = 0; i > 0 && r < 6; i--, r++) {
            for (int p = 0; p < i; p++) {
                System.out.print(" ");
            }
            for (int p = 0; p < r; p++) {
                System.out.print("*");
            }
            for (int p = 1; p < r; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}