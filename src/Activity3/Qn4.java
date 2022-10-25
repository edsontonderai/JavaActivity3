package Activity3;
// single array to prices for shop A and shop B
public class Qn4 {
    public static void main(String[] args) {
        String prices [][] =new String[4][2]; //declaring array columns
        prices[0][0]="12.45";
        prices[1][0]="100.23";
        prices[2][0]="96.99";
        prices[3][0]="245.50";
        prices[0][1]="11.39";
        prices[1][1]="100.80";
        prices[2][1]="94.78";
        prices[3][1]="247.00";

        for(int shopa=0; shopa<prices.length;shopa++){//first for loop is for the row
            for(int shopb=0; shopb<prices[shopa].length;shopb++){
                System.out.println(prices[shopa][shopb]+"");
            }

        }

    }
}

