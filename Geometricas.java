package Ejercicios_Lección_1;

// Class Figura
abstract class Figura{
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

// Clase Triangulo
class Triangulo extends Figura{
    double base;
    double altura;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double calcularArea(){
        return (base * altura) / 2;
    }
    
    @Override
    double calcularPerimetro(){
        // Suponineo que es un trinagulo cualquier. no equlátero
        return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}

// Clase Cuadrado
class Cuadrado extends Figura{
   double lado;
   
   Cuadrado(double lado){
       this.lado = lado;
   }
   
   @Override
   double calcularArea(){
       return lado * lado;
   }
   
   @Override
   double calcularPerimetro(){
       return 4 * lado;
   }
}

// Clase Rectangulo
class Rectangulo extends Figura{
    double base;
    double altura;
    
    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double calcularArea(){
        return base * altura;
    }
    
    @Override
    double calcularPerimetro(){
        return 2 * (base + altura);
    }
}

// Programa principal


public class Geometricas {
    public static void main(String[] args) {
        
        // Crear instancias de diferentes figuras
        Triangulo triangulo = new Triangulo(3, 4);
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        
        // Calcular y mostrar areas y perimetros
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
        
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        
        
        
        
        
        
        
        
        
        
    }
    
}
