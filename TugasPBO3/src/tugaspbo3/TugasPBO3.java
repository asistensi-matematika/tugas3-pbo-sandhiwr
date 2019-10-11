/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TugasPBO3 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double D = input.nextDouble();
        double E = input.nextDouble();
        double F = input.nextDouble();
       
        LinearEquation baru = new LinearEquation();
        baru.setA(A);
        baru.setB(B);
        baru.setC(C);
        baru.setD(D);
        baru.setE(E);
        baru.setF(F);
        baru.hasil();
        
    }
    
}

class LinearEquation {
    private double a, b, c, d, e, f;
    
    public LinearEquation(){
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        
    }   
    
    public LinearEquation(double A, double B, double C, double D, double E, double F){
        this.a = A;
        this.b = B;
        this.c = C;
        this.d = D;
        this.e = E;
        this.f = F;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getNilaiX(){
        double hasil = (e*d-b*f)/(a*d-b*c);
        if(hasil<0){
        double output = Math.ceil(hasil*1000)/1000;
        return output;
    }
        else if(hasil == -0){
            return hasil = hasil*-1; 
        }
        else{
         double output = Math.floor(hasil*1000)/1000;
         return output;
        }
    }
    
    public double getNilaiY(){     
        double hasil = (a*f-e*c)/(a*d-b*c);
       if(hasil<0){
        double output = Math.ceil(hasil*1000)/1000;
        return output;
    }
        else if(hasil == -0){
            return hasil = hasil*-1; 
        }
        else{
         double output = Math.floor(hasil*1000)/1000;
         return output;
        }
    }
    
    public boolean cekSolusi(){
        if(a*d-b*c != 0){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void hasil(){
        if(b<0&&d<0){
            if(cekSolusi() == true ){
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"- "+-b+"y "+"= "+e);
            System.out.println(c+"x "+"- "+-d+"y "+"= "+f);
            System.out.println("\nHasilnya :\n"+"x = "+getNilaiX()+"\n"+"y = "+getNilaiY());
        }
        else{
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"- "+-b+"y "+"= "+e);
            System.out.println(c+"x "+"- "+-d+"y "+"= "+f);
            System.out.println("\nSistem Tidak Memiliki Penyelesaian");
        }
        }
        else if (b<0){
            if(cekSolusi() == true ){
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"- "+-b+"y "+"= "+e);
            System.out.println(c+"x "+"+ "+d+"y "+"= "+f);
            System.out.println("\nHasilnya :\n"+"x = "+getNilaiX()+"\n"+"y = "+getNilaiY());
        }
        else{
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"- "+-b+"y "+"= "+e);
            System.out.println(c+"x "+"+ "+d+"y "+"= "+f);
            System.out.println("\nSistem Tidak Memiliki Penyelesaian");
        }
        }
        else if (d<0){
             if(cekSolusi() == true ){
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"+ "+b+"y "+"= "+e);
            System.out.println(c+"x "+"- "+-d+"y "+"= "+f);
            System.out.println("\nHasilnya :\n"+"x = "+getNilaiX()+"\n"+"y = "+getNilaiY());
        }
        else{
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"+ "+b+"y "+"= "+e);
            System.out.println(c+"x "+"- "+-d+"y "+"= "+f);
            System.out.println("\nSistem Tidak Memiliki Penyelesaian");
        }
        }
        else{
            if(cekSolusi() == true ){
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"+ "+b+"y "+"= "+e);
            System.out.println(c+"x "+"+ "+d+"y "+"= "+f);
            System.out.println("\nHasilnya :\n"+"x = "+getNilaiX()+"\n"+"y = "+getNilaiY());
        }
        else{
            System.out.println("\nSistem Persamaannya : ");
            System.out.println(a+"x "+"+ "+b+"y "+"= "+e);
            System.out.println(c+"x "+"+ "+d+"y "+"= "+f);
            System.out.println("\nSistem Tidak Memiliki Penyelesaian");
        }
        }
    }
}
