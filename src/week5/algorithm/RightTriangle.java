package week5.algorithm;

public class RightTriangle {

    private String letter ="*";

    public RightTriangle(String letter) {
        this.letter = letter;
    }

    public void printStar(int n) {

        for(int i=1; i <= n; i++){
            for(int j=0; j<i; j++){
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        RightTriangle triangle = new RightTriangle("@");
        triangle.printStar(4);

    }
}
