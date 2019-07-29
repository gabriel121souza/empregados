package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                
                System.out.println("enter the number of  employee: ");
                int n = sc.nextInt();
                //criando a lista
                List<Employee> list = new ArrayList<>();
                
                // ler n funcionarios
                for(int i= 1; i<=n; i++){
                
                // ler os atributos do funcionarios    
                    System.out.println("Employer #" + i+" data");
                    System.out.print("Outsourced(y/n)");
                    char ch = sc.next().charAt(0);
                    System.out.print("name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Hours: ");
                    int hours =sc.nextInt();
                    System.out.println("Value Per Hours: ");
                    double valuePerHours = sc.nextDouble();
                    //fazendo as escolha se e sim ou nao
                    if(ch =='y'){
                        System.out.print("Additional  charge: ");
                        double additionalCharge = sc.nextDouble();
                        //instanciando o funcionario
                         
                        //adcionando a list
                        list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
                        
                    }
                    //caso o funcionario nao e privatizado use a classe Employee
                    else{
                       
                        list.add(new Employee(name, hours, valuePerHours));
                    }
                    
                    System.out.println();
                    System.out.println("PAYMENTS");
                    //pecorre a lista para extrair o valores
                    for(Employee  emp : list ){
                        System.out.println(emp.getName()+" - $ "+ String.format("%.2f", emp.payment())); 
                    }
                }
        }
}