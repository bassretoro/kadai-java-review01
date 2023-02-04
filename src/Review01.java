
public class Review01 {


        //mainメソッド
        public static void main(String[] args) {
            int price = 1500 ; //商品価格
            int result ;
            result = tax (price);//消費税額
            int total = price + result ; //商品価格+消費税
            System.out.println(price+"円の商品の税込価格は"+total+"円（消費税は"+result+"円）です。");
        }

        //taxメソッド
        public static int tax(int price) {
            int tax = (int) (price*0.10) ;  //　値段×消費税率
            return tax ;

        }

    }
    