public class Main {

    public Main(){}

    public class Persona{
        private  int edad;
        private String nombre;
        private  int telefono;

        public Persona(){}


        //bloque de metodos getters y setters
        //000000000000000000000000000000000000000000000000000000

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        //finalizacion de getter y setters
        //finalizacion de clase persona
        //000000000000000000000000000000000000000000000000000000
    }

    public static void main(String[] args) {
        Main programa= new Main();
        programa.run();


    }

    public void run(){
        Persona fervic = new Persona();
        fervic.setEdad(27);
        fervic.setNombre("Fervic");
        fervic.setTelefono(429051556);

        System.out.println("edad: "+ fervic.getEdad());
        System.out.println("Nombre: "+ fervic.getNombre());
        System.out.println("Telefono: "+ fervic.getTelefono());
    }


}