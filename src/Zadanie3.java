public class Zadanie3 {
    public static void main(String[] args) {
        double price1 = 10;
        double price2 = 1;
        double price3 = 1000;

        if(price1 < price2 && price1 < price3){
            System.out.println("najtańszy kkomputer kosztuje"+price1);
        }else if(price2<price3){
            System.out.println("najtańszy komputer kosztuje:"+price2);
        }else{
            System.out.println("najtańszy komputer kosztuje"+price3);
        }
    }
}
