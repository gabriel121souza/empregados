
package entities;


public class Employee {
    //atribuindo os valores
    private String name;
    private Integer hours;
    private Double valuePerHour;

       //construtor padrão;
    public Employee(){}
     
        //construtor com Argumentos;
    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    
        //Criando os Getters e Setters
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }   


    //criando o metodo payment (pagamento);
    
    public double payment(){
        return hours *valuePerHour;
    }
}
