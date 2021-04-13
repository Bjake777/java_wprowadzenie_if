public class Zadanie2 {
    public static void main(String[] args) {
        int distance = 10000000;
        if(distance<450){
            System.out.println("zła wartość");
        }else if (distance<=300){
            System.out.println("idż pieszo");
        }else if (distance<=1000000){
            System.out.println("jedź samochodem");
        }else{
            System.out.println("leć samolotem");
        }
    }
}
