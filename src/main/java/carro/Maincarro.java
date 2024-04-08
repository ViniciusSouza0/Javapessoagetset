package carro;
public class Maincarro {
    
public static void main(String[] args) {
    
    
    //Modo Get
    Carro c = new Carro ("Toyota", "Corolla",2024);
    System.out.println(c.getMarca());
    System.out.println(c.getModelo());
    System.out.println(c.getAno());
    
    
    
    
    //Modo Set
    System.out.println("\n");
    
    c.setMarca("Honda");
    c.setModelo("Civic");
    c.setAno(2024);
    
    System.out.println(c.getMarca());
    System.out.println(c.getModelo());
    System.out.println(c.getAno());
}
}
