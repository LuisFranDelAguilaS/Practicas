
import java.util.Scanner;

// Los alumnos son del 0 al 9

public class claseInicial {

    static Scanner sc = new Scanner(System.in);
    public static void  main(String[] args) {
        int a;
        Estudiante al1 = new Estudiante("Luis", 112312, "Ciencias", 40, "");
        Estudiante al2 = new Estudiante("Perla", 1212312, "Ciencias", 78, "");
        Estudiante al3 = new Estudiante("Benito", 123232, "Ciencias", 43, "");
        Estudiante al4 = new Estudiante("Juan", 123324, "Ciencias ", 90, "");
        Estudiante al5 = new Estudiante("Adriana", 123213, "Ciencias", 85, "");
        Estudiante al6 = new Estudiante("",0,"",0,"");
        Estudiante al7 = new Estudiante("",0,"",0,"");
        Estudiante al8 = new Estudiante("",0,"",0,"");
        Estudiante al9 = new Estudiante("",0,"",0,"");
        Estudiante al10 = new Estudiante("",0,"",0,"");



        int opcion = 0;

        do {

            System.out.println("-Opciones que puedes realizar-");
            System.out.println("1-Capturar Alumnos");
            System.out.println("2-Mostrar alumnos. ");
            System.out.println("3-Cambiar calificación");
            System.out.println("4-Salir");
            System.out.println("Cual opcion desea? :  ");


            opcion = sc.nextInt();



            switch (opcion) {


                case 1:

                    a=1;
                    al6 = new Estudiante(CapturaEntrada.capturarCadena("Dame el nombre al6"), CapturaEntrada.capturarEntero("Dame el num de control al6"), CapturaEntrada.capturarCadena("Dame la materia al6"), CapturaEntrada.capturarEntero("Dame la calificacion al6"), "");
                    al7 = new Estudiante(CapturaEntrada.capturarCadena("Dame el nombre al7"), CapturaEntrada.capturarEntero("Dame el num de control al7"), CapturaEntrada.capturarCadena("Dame la materia al7"), CapturaEntrada.capturarEntero("Dame la calificacion al7"), "");
                    al8 = new Estudiante(CapturaEntrada.capturarCadena("Dame el nombre al8"), CapturaEntrada.capturarEntero("Dame el num de control al8"), CapturaEntrada.capturarCadena("Dame la materia al8"), CapturaEntrada.capturarEntero("Dame la calificacion al8"), "");
                    al9 = new Estudiante(CapturaEntrada.capturarCadena("Dame el nombre al9"), CapturaEntrada.capturarEntero("Dame el num de control al9"), CapturaEntrada.capturarCadena("Dame la materia al9"), CapturaEntrada.capturarEntero("Dame la calificacion al9"), "");
                    al10 = new Estudiante(CapturaEntrada.capturarCadena("Dame el nombre al10"), CapturaEntrada.capturarEntero("Dame el num de control al10"), CapturaEntrada.capturarCadena("Dame la materia al10"), CapturaEntrada.capturarEntero("Dame la calificacion al10"), "");

                    break;


                case 2:
                    al1.Metodo(al1.calificacion);
                    al2.Metodo(al2.calificacion);
                    al3.Metodo(al3.calificacion);
                    al4.Metodo(al4.calificacion);
                    al5.Metodo(al5.calificacion);
                    al6.Metodo(al6.calificacion);
                    al7.Metodo(al7.calificacion);
                    al8.Metodo(al8.calificacion);
                    al9.Metodo(al9.calificacion);
                    al10.Metodo(al10.calificacion);


                    System.out.println(al1.getNombre());
                    System.out.println(al1.getNumContol());
                    System.out.println(al1.getMateria());
                    System.out.println(al1.getCalificacion());
                    System.out.println(al1.getEstado());
                    System.out.println();

                    System.out.println(al2.getNombre());
                    System.out.println(al2.getNumContol());
                    System.out.println(al2.getMateria());
                    System.out.println(al2.getCalificacion());
                    System.out.println(al2.getEstado());
                    System.out.println();

                    System.out.println(al3.getNombre());
                    System.out.println(al3.getNumContol());
                    System.out.println(al3.getMateria());
                    System.out.println(al3.getCalificacion());
                    System.out.println(al3.getEstado());
                    System.out.println();

                    System.out.println(al4.getNombre());
                    System.out.println(al4.getNumContol());
                    System.out.println(al4.getMateria());
                    System.out.println(al4.getCalificacion());
                    System.out.println(al4.getEstado());
                    System.out.println();

                    System.out.println(al5.getNombre());
                    System.out.println(al5.getNumContol());
                    System.out.println(al5.getMateria());
                    System.out.println(al5.getCalificacion());
                    System.out.println(al5.getEstado());
                    System.out.println();
                    if (al6.numControl==0){
                        a=1;
                    }
                    else {
                        System.out.println(al6.getNombre());
                        System.out.println(al6.getNumContol());
                        System.out.println(al6.getMateria());
                        System.out.println(al6.getCalificacion());
                        System.out.println(al6.getEstado());
                        System.out.println();

                        System.out.println(al7.getNombre());
                        System.out.println(al7.getNumContol());
                        System.out.println(al7.getMateria());
                        System.out.println(al7.getCalificacion());
                        System.out.println(al7.getEstado());
                        System.out.println();

                        System.out.println(al8.getNombre());
                        System.out.println(al8.getNumContol());
                        System.out.println(al8.getMateria());
                        System.out.println(al8.getCalificacion());
                        System.out.println(al8.getEstado());
                        System.out.println();

                        System.out.println(al9.getNombre());
                        System.out.println(al9.getNumContol());
                        System.out.println(al9.getMateria());
                        System.out.println(al9.getCalificacion());
                        System.out.println(al9.getEstado());
                        System.out.println();

                        System.out.println(al10.getNombre());
                        System.out.println(al10.getNumContol());
                        System.out.println(al10.getMateria());
                        System.out.println(al10.getCalificacion());
                        System.out.println(al10.getEstado());
                        System.out.println();
                    }

                    break;

                case 3:

                    int op = 0;

                        System.out.println("-Opciones que puedes realizar-");
                        System.out.println("Que numero de alumno quiere cambiar calificacion?");


                        opcion = sc.nextInt();

                        switch (opcion) {

                            case 1:
                                al1.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");
                                break;
                            case 2:
                                al2.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");

                                break;
                            case 3:
                                al3.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");

                                break;
                            case 4:
                                al4.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");
                                break;
                            case 5:
                                al5.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");

                                break;

                            case 6:
                                al6.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");

                                break;

                            case 7:
                                al7.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");
                                break;

                            case 8:
                                al8.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");
                                break;
                            case 9:
                                al9.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");
                                break;
                            case 10:

                                al10.calificacion= CapturaEntrada.capturarFlotante("Dame la calificacion nueva");
                                break;

                        }
                        break;
            }


        } while (opcion != 4);
    }

}



 class Estudiante {

     String nombre;
     int numControl;
     String materia;
     float calificacion;
     String estado;

     public Estudiante(String nombre, int numControl, String materia, float calificacion, String estado) {

         setNombre(nombre);
         setNumControl(numControl);
         setMateria(materia);
         setCalificacion(calificacion);
         setEstado(estado);

     }

     //Setters
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public void setNumControl(int numControl) {
         this.numControl = numControl;
     }

     public void setMateria(String materia) {
         this.materia = materia;
     }

     public void setCalificacion(float calificacion) {
         this.calificacion = calificacion;
     }

     public void setEstado(String estado) {
         this.estado = estado;
     }

     //Getters
     public String getNombre() {
         return nombre;
     }

     public int getNumContol() {
         return numControl;
     }

     public String getMateria() {
         return materia;
     }

     public float getCalificacion() {
         return calificacion;
     }

     public String getEstado() {
         return estado;
     }


     // METODO

     public String Metodo(float calificacion ){

         if (calificacion<60){
             estado="Reprobado";

             return estado;
         }
         else{
             estado="Aprobado";

             return  estado;
         }

     }


}

class CapturaEntrada {

    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}

