package BasicJava.Patterns;

public class SolidRectangleStar {
    public static void main(String[] args) {
        // To print solid rectangle star
        for (int i=0;i<3;i++){
            for (int j =0;j<8;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
