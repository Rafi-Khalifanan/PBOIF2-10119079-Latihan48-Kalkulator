package pboif2.pkg10119079.latihan48.kalkulator;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan48Kalkulator {
    public static void main(String[] args) {
        Kalkulator calculator= new Kalkulator();
        
        calculator.setValue1(7);
        calculator.setValue2(5);
        System.out.println("VALUE 1 = "+ calculator.getValue1());
        System.out.println("VALUE 2 = "+ calculator.getValue2());
        calculator.setNameProject();
        calculator.setNoteProject("This project shown you how to manage methode in java");
        System.out.println("Result Add is = "+ calculator.add(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Minus is = "+ calculator.minus(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Multiple is = "+ calculator.multiplication(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Division is = "+ calculator.division(calculator.getValue1(), calculator.getValue2()));

        
    }
    
}