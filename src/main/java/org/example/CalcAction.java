package org.example;

import MyException.EmptyValuesException;
import MyException.NullException;
import MyException.RangeValuesException;
import MyException.StringException;

public class CalcAction {
    public double sum(double a, double b){
        return  a + b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public double division(double a, double b){
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

    public boolean CheckErrorRun(String a, String b, String key){
        boolean result = false;
        try{
            if (a.isEmpty()|b.isEmpty()|key.isEmpty()){
                throw new EmptyValuesException();
            }else if((isString(a) | isString(b) | isString(key))){
                throw new StringException();
            }else{
                result = CheckError(Double.parseDouble(b),Integer.parseInt(key));
            }
        }catch (StringException | EmptyValuesException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    private boolean CheckError(double b, int key){
        boolean result = false;

        try{
            if (key > 5 | key < 1){ // диапазон ключа
                throw new RangeValuesException();
            } else if(key==4 & b==0){ // деление на ноль
                throw new NullException();
            }else {
                result = true;
            }
        }catch (NullException | RangeValuesException e){
            System.out.println(e.getMessage());
        }
        return result;
    }




    public double SelectMethod(double a, double b, int key){
        return switch (key) {
            case 1 -> sum(a, b);
            case 2 -> subtraction(a, b);
            case 3 -> multiplication(a, b);
            case 4 -> division(a, b);
            case 5 -> Pow(a, b);
            default -> 0;
        };
    }
}
