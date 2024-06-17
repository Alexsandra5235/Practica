package org.example;

public class CalcAction {
    public double Summa(double a,double b){
        return  a + b;
    }
    public double Munus(double a, double b){
        return a-b;
    }
    public double Ymnog(double a,double b){
        return a*b;
    }
    public double Delenie(double a,double b){
        return a/b;

    }
    public double Pow(double a, double b){
        return Math.pow(a,b);
    }
    private static boolean isString(String value) {
        try {
            Double.parseDouble(value); // Пытаемся преобразовать строку в число
            return false; // Если не было ошибки, значит это число, а не строка
        } catch (NumberFormatException e) {
            return true; // Если была ошибка, значит это строка
        }
    }



    public double Run(double a,double b, String key){

//        try{
//            System.out.println("Change action with number:\n" +
//                    "1. Add\n" +
//                    "2. Subtract\n" +
//                    "3. Multiply\n" +
//                    "4. Splitting\n" +
//                    "5. Pow\n");
//            if (key.isEmpty()){
//                key ="0";
//                throw new EmptyValuesException();
//            }
//            if(isString(key)){
//                key ="0";
//                throw new StringException();
//            }
//            if (Double.parseDouble(key)>5 || Double.parseDouble(key)<1){
//                key ="0";
//                throw new RangeValuesException();
//            }
//
//        }
//        catch (StringException e){
//            System.out.println("Error:\n" + e.getMessage());
//        }
//        catch (RangeValuesException e){
//            System.out.println("Error:\n" + e.getMessage());
//        }
//        catch (EmptyValuesException e){
//            System.out.println("Error:\n" + e.getMessage());
//        }
//
//        try{
//            System.out.println("Enter the numbers to calculate");
//            a = scanner.nextLine();
//            b = scanner.nextLine();
//            if(isString(a) || isString(b)){
//
//                throw new StringException();
//            }
//            if (Double.parseDouble(b)==0){
//                throw new NullException();
//            }
//        }
//        catch (StringException | NullException e){
//            System.out.println("Error:\n" + e.getMessage());
//            throw new RuntimeException(e);
//        }
//


        double result = 0;
        switch (key){
            case "1":
                System.out.println(Summa(a,b));
                break;
            case "2":
                System.out.println(Munus(a,b));
                break;
            case "3":
                System.out.println(Ymnog(a,b));
                break;
            case "4":
                result = Delenie(a,b);
                break;
            case "5":
                System.out.println(Pow(a,b));
                break;
        }
        return result;
    }
}
