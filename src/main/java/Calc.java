import java.util.Scanner;

public class Calc {
    private String [] mas;
    private int res;
    boolean isResult = true;

    public static void main(String[] args) {
        Calc myC = new Calc();
        myC.consoleCalculator();
        myC.functionCalc(myC.mas);
        if (myC.isResult){
            myC.concoleResult();

        }

    }
    public void consoleCalculator() {
        System.out.println("Введите пример: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        this.mas= str.split(" ");
    }
    public void functionCalc(String[] mas){
        switch (mas[1]){
            case "+": this.res = Integer.parseInt(mas[0]) + Integer.parseInt(mas[2]);
            break;
            case "-": this.res = Integer.parseInt(mas[0]) - Integer.parseInt(mas[2]);
            break;
            case "*": this.res = Integer.parseInt(mas[0]) * Integer.parseInt(mas[2]);
            break;
            case"/":
               try{
                   this.res = Integer.parseInt(mas[0]) / Integer.parseInt(mas[2]);

            }catch(ArithmeticException e){
                   isResult=false;
                   System.out.println("Делить на 0 нельзя");
               }

        }
    }
    public void concoleResult(){
        System.out.println("Результат: " + this.res);
    }
}
