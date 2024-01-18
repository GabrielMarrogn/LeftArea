import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[][] arr = new double[12][12];

        String s = br.readLine();

        double calc = 0;
        boolean check = true;
        int value = 0;
        int k = 0;
        int arrL = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            for(k = 0; k < arr[i].length; k++){
                double a = Double.parseDouble(br.readLine());
                arr[i][k] = a;
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (value == 6) {
                check = false;
                value--;
            }

            for (k = 0; k < value; k++) {
                calc += arr[i][k];
            }

            if (value < 6 && check == true) {
                value++;
            } else if (check == false) {
                value--;
            } else if (k == arrL) {
                break;
            }
        }

        DecimalFormat decimal = new DecimalFormat("0.0");
    
        if(s.equals("S")){
            System.out.println(decimal.format(calc));
        }else if(s.equals("M")){
            calc = calc/30;
            System.out.println(decimal.format(calc)); 
        }
    }
}
