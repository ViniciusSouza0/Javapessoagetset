package carro;
public class Carro {
    
private String marca;
private String modelo;
private int ano;
    
//construtor
    
public Carro (String marca, String modelo, int ano){
this.marca = marca;
this.modelo = modelo;
this.ano = ano;
    }


 //Metodos Get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    //Metodos Set
    public void setMarca (String Marca){
        this.marca = marca;
    }
    public void setModelo (String Modelo){
        this.modelo = modelo;
    }
    public void setAno (int ano){
        this.ano = ano;
    }
}
