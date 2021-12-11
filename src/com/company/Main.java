package com.company;
import java.util.Scanner;
class Client {
    private int nr;
    private int hours;
    private double pay;
    public Client(){;}
    public double calculateCharges(int hours) {
        if(hours<3) {
            pay=hours*2.00;
        }
        if(hours>3) {
            pay=hours*2.5;
        }
        if(hours==24) {
            System.out.println("Ошибка!Ни одна машина не паркуется более 24 часов подряд!");
        }
        return pay;
    }
}
public class Main {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Введите количество клиентов: ");
        int count=input.nextInt();
        Client client=new Client();
        double [] Array=new double[count];
        for(int i=0;i<Array.length;i++)
        {
            System.out.print("Введите количество часов: ");
            int hours=input.nextInt();
            System.out.println("Клиент nr "+(i+1)+" оплатил: ");
            Array[i]=client.calculateCharges(hours);
            System.out.println(Array[i]);
        }
    }
}
