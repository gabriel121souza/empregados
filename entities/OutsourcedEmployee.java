package entities;

//a classe possui heranca da classe Employee
public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    //construtor padrao;
    
    public OutsourcedEmployee(){}

    
    
    // construtor puxando os argumentos da heranca da classe Employee
    public OutsourcedEmployee(Double additionalCharge, String name, int hours, double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHours, double additionalCharge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Criando os Getters e Setters;
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    //o Override e usado quando os metodos sao iguais com resultados diferente
    @Override
    public double payment(){
      return super.payment() + additionalCharge * 1.1;
    }
}
