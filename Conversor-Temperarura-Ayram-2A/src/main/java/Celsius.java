//classe filha
public class Celsius extends Temperatura {
    public Celsius(double valorGraus){
        super(valorGraus);
        //o 'super' se refere a classe pai
    }
    
    //criando os metodos para converter
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;    
    }
    
    //criando metodo de celsios para kelvin
    public double paraKelvin(){
        return getGraus()+273;
    }
}
