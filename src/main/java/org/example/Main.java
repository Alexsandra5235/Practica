package org.example;

public class Main {
    public static void main(String[] args) {
        CalcAction calcAction = new CalcAction();

//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        String key = scanner.nextLine();
        String a = "5";
        String b = "8";
        String key = "2";
        if (calcAction.CheckErrorRun(a,b,key)){
            System.out.println(calcAction.SelectMethod(Double.parseDouble(a),Double.parseDouble(b),Integer.parseInt(key)));
        }


    }

}