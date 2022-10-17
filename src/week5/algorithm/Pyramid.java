package week5.algorithm;

public class Pyramid {

    public void printStar(int N) {

        for (int i = 0; i < N; i++) {
            //공백 출력
            for (int j = N-1-i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Pyramid pyramid = new Pyramid();
        pyramid.printStar(5);

    }
}
