
public class Fahrenheit extends Temperatura{
    
    public Fahrenheit(double valorGraus) {
        super(valorGraus);
    }
    
    //metodo fahrenheit para celcius
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    
    //metodo que converta fahrenheit para kelvin
    public double paraKelvin(){
        return paraCelsius()+273;
    }
    
    
}
