package lab2p1_hectorflores;
import java.util.Scanner;

public class Lab2P1_HectorFlores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Dibujando triangulos");
        System.out.println("2. Area de figuras");
        System.out.println("3. Evaluando numeros");
        System.out.println("4. Salir del programa");
        System.out.println("Ingrese el ejercicio que desea ejecutar");
        
        int opcion = scanner.nextInt();
        
        while (opcion > 0 && opcion < 4){
            if (opcion == 1){
                System.out.println("Ingrese longitudes a, b y c de su triangulo");
                System.out.print("a: ");
                double a = scanner.nextDouble();
                System.out.print("b: ");
                double b = scanner.nextDouble();
                System.out.print("c: ");
                double c = scanner.nextDouble();
                
                while (a <= 0 || b <= 0 ||c <= 0){
                    System.out.println("Invalido. Longitudes deben ser mayores a 0");
                    
                    System.out.println("Ingrese longitudes a, b y c de su triangulo");
                    System.out.print("a: ");
                    a = scanner.nextDouble();
                    
                    System.out.println("Ingrese longitudes a, b y c de su triangulo");
                    System.out.print("b: ");
                    b = scanner.nextDouble();
                    
                    System.out.println("Ingrese longitudes a, b y c de su triangulo");
                    System.out.print("c: ");
                    c = scanner.nextDouble();
                }
                
                if (a + b > c && a + c > b && b + c > a){
                    System.out.println("Si forma un triangulo");
                } else{
                    System.out.println("No forma un triangulo");
                }
            } else if (opcion == 2){
                double area;
                
                char respuesta = 's';
                
                while (respuesta == 's' || respuesta == 'S'){
                    System.out.println("1. Rectangulo");
                    System.out.println("2. Triangulo");
                    System.out.println("3. Circulo");
                    System.out.println("De que figura desea sacar el area?");
                
                    int figura = scanner.nextInt();
                
                    while (figura <=0 || figura > 3){
                        System.out.println("Por favor seleccione 1, 2 o 3");
                        figura = scanner.nextInt();
                    }
                    if (figura == 1){
                        System.out.println("Ingrese base del rectangulo");
                        double base = scanner.nextDouble();
                        while (base <= 0){
                            System.out.println("Ingresar una longitud mayor a 0");
                            base = scanner.nextDouble();
                        }
                        System.out.println("Ingrese altura del rectangulo");
                        double altura = scanner.nextDouble();
                        while (altura <= 0){
                            System.out.println("Ingresar una longitud mayor a 0");
                            altura = scanner.nextDouble();
                        }
                    
                       area = base * altura;
                        System.out.println("Area del rectangulo es: " + area + " unidades cuadradas.");
                    } else if (figura == 2){
                        System.out.println("Ingrese la base del triangulo");
                        double base = scanner.nextDouble();
                        System.out.println(base);
                        while (base <= 0){
                            System.out.println("Ingresar una longitud mayor a 0");
                            base = scanner.nextDouble();
                        }
                        System.out.println("Ingrese la altura del triangulo");
                        double altura = scanner.nextDouble();
                        System.out.println(altura);
                        while (altura <= 0){
                            System.out.println("Ingresar una longitud mayor a 0");
                            base = scanner.nextDouble();
                        }
                    
                        area = (base * altura)/2;
                        System.out.println("El area del triangulo es: " + area + " unidades cuadradas.");
                    } else {
                        System.out.println("Ingrese el radio del circulo");
                        double radio = scanner.nextDouble();
                        while (radio <= 0){
                            System.out.println("Ingrese iun radio mayor a 0");
                            radio = scanner.nextDouble();
                        }
                    
                        area = 3.1415926535897932 * radio * radio;
                        System.out.println("El area del circulo es " + area + " unidades cuadradas.");
                    }
                    System.out.println("Desea sacar el area de otra figura? [s/n]");
                    respuesta = scanner.next().charAt(0);
                }
            } else if (opcion == 3){
                System.out.println("El numero a evaluar");
                int num = scanner.nextInt();
                boolean vofpar;
                boolean vofprimo = false;
                
                if (num % 2 == 0){
                    vofpar = true;
                } else {
                    vofpar = false;
                }
                
                if (num == 2){
                    vofprimo = true;
                } else{
                    int divisor = 2;
                    while (divisor < num){
                        if (num == 2){
                            vofprimo = true;
                        } else if (num % divisor == 0){
                            vofprimo = true;
                        } else {
                            vofprimo = false;
                        }
                        divisor++;
                    }
                }
                
                if (vofpar && vofprimo){
                    System.out.println(num + " es par y primo");
                } else if (vofpar){
                    System.out.println(num + " es par");
                } else {
                    System.out.println(num + " es primo");
                }
            }
            System.out.println("1. Dibujando triangulos");
            System.out.println("2. Area de figuras");
            System.out.println("3. Evaluando numeros");
            System.out.println("4. Salir del programa");
            System.out.println("Ingrese el ejercicio que desea ejecutar");
        
            opcion = scanner.nextInt();
        }
        System.out.println("Salio del programa");
    }    
}