public class Main {

    public class Persona{
        int edad;
        String nombre;
        int telefono;


    }

    public class cliente extends Persona{
        int credito;

        public void mostrarDatos(){
            System.out.println("mi edad es: " + edad);
            System.out.println("mi nombre es: " + nombre);
            System.out.println("mi telefono es: " + telefono);
            System.out.println("mi credito es: " + credito);
        }

        public cliente(int edad, String nombre, int telefono, int credito){
            this.edad = edad;
            this.nombre=nombre;
            this.telefono = telefono;
            this.credito= credito;

        }

    }

    public class Trabajador extends Persona{
        int salario;

        public Trabajador(int edad, String nombre, int telefono, int salario){
            this.edad = edad;
            this.nombre=nombre;
            this.telefono = telefono;
            this.salario= salario;

        }


        public void mostrarDatos(){
            System.out.println("mi edad es: " + edad);
            System.out.println("mi nombre es: " + nombre);
            System.out.println("mi telefono es: " + telefono);
            System.out.println("mi credito es: " + salario);
        }
    }


    public static void main(String[] args) {
        Main programa= new Main();
        programa.run();





    }

    public void run(){
        cliente fervic = new cliente(27,"Fervic",543,867);
        Trabajador jose = new Trabajador(38,"Jose",3545,15000);
        fervic.mostrarDatos();
        jose.mostrarDatos();
        }


}