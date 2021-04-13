public class Zadanie4 {
    public static void main(String[] args) {
        int[] numbers = {1, 19, 67, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i]*2+4)<8){
                System.out.println("Tak");
            }else {
                System.out.println("nie");
            }
        }
    }
}
