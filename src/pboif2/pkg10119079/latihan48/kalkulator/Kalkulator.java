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
public class Kalkulator {
    private double value1,value2;
    
    public double getValue1(){
        return value1;
    }
    
    public void setValue1(double value1){
        this.value1=value1;
    }
    
    public double getValue2(){
        return value2;
    }
    
    public void setValue2(double value2){
        this.value2=value2;
    }
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    public void setNoteProject(String note){
        System.out.println("This Project shows you how to manage method in Java");
    }
    double add(double val1, double val2){
        return val1+val2;
    }
    
    double minus(double val1, double val2){
        return val1-val2;
    }
    double multiplication(double val1, double val2){
        return val1*val2;
    }
    double division(double val1, double val2){
        return val1/val2;
    }
}
