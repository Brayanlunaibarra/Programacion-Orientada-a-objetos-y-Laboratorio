//se hara un proyacto de manejo de control escolar.
import java.util.Scanner;
public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        //declaramos las variables 
        int alumnosTotales, alumnosCostos,trabajadoresTotales, trabajadoresCostos, maestrosTotales, maestrosCostos, hombres, mujeres,totalDeIngresos;
        double promedioDeEdad, edad, sumaDeEdad, personas;
        String sexo, tipoDeParticipante, nombre;
        Scanner obj=new Scanner(System.in);
        //pedimos el nuemero de particiopantes 
        personas=0.00;
        System.out.print("Dame el numero de participantes");
        personas=obj.nextDouble();
        //iniciamos las variables 
        alumnosCostos=0;
        maestrosCostos=0;
        trabajadoresCostos=0;
        alumnosTotales=0;
        maestrosTotales=0;
        trabajadoresTotales=0;
        totalDeIngresos=0;
        sumaDeEdad=0;
        hombres=0;
        mujeres=0;
        sumaDeEdad=0.00;
        
        //iniciamso con el programa 
        for (int i = 0; i < personas; i++) {

            //pedimos los datos de cada usuario
            System.out.print("Dame el nombre: ");
            nombre=obj.next();
            System.out.print("Dame la edad : ");
            edad=obj.nextFloat();
            System.out.print("Dame su sexo M(masculino) y f(femenino) : ");
            sexo =obj.next();
            System.out.print("Dame Tipo de Participante (Alumno A, Docente D, Trabajador T): ");
            tipoDeParticipante=obj.next();



            //clasificamos los participantes por su profecion y hacemos las sumas correspondientes 
            sumaDeEdad += edad;
            switch (tipoDeParticipante) {
                case "A":
                    alumnosCostos=alumnosCostos+50;
                    alumnosTotales +=1;
                    totalDeIngresos +=50;
                    break;
                case"D":
                    maestrosCostos=maestrosCostos+80;
                    maestrosTotales +=1;
                    totalDeIngresos+=80;
                    break;
                case"T":
                    trabajadoresCostos=trabajadoresCostos+60;
                    trabajadoresTotales +=1;
                    totalDeIngresos+=60;
                    break;

            
                default:System.out.print("%nlos datos que diste estan mal verifica que sean muy bien escritos XD.");
                    break;
            
            }
            //clasificamos a los participantes por su sexo 
                    switch (sexo) {
                case "M":
                    hombres +=1;
                    break;
                    
                case "f":
                    mujeres +=1;
                    break;
                default:System.out.print("%nlos datos que diste en el apartado sexo estan erroneos buelve ha hacer todo el proceso XD");
                    break;
            }
        
          
            
        }
        //ahora hacemos la prencentacionde los datos 
        //hacemos el proedio de las edades 
        promedioDeEdad =sumaDeEdad/personas;
        // Mostramos lo referente a las cantidades 
        System.out.printf("los participantes totales son %.2f", personas);
        System.out.printf("%nlos Docentes  son %d", maestrosTotales);
        System.out.printf("%nlos Alumnos son %d",alumnosTotales );
        System.out.printf("%ntotal de trabajadores es %d", trabajadoresTotales);
        System.out.printf("%nlos participantes totales son %.2f", personas  );
        System.out.printf("%nel total de mujeres es  %d", mujeres );
        System.out.printf("%nel promedio de la edad en general es : %.2f", promedioDeEdad );
        System.out.printf("%nel total de costos es :", totalDeIngresos );
        System.out.printf("%nel total ingresos por parte de los Docentes  %d", maestrosCostos );
        System.out.printf("%nel total de ingresos trabajadores %d", trabajadoresCostos );
        if (totalDeIngresos<100) {
            System.out.print("%n El evento concluye con ganancias BAJAS");
            
        }
        if (totalDeIngresos>100 && totalDeIngresos<200) {
            System.out.print("%nEl evento concluye con ganancias MODERADAS");
            
        }
        if (totalDeIngresos>200) {
            System.out.print(", el evento concluye con buenas ganancias ");
        }

        




            
        
    }
            
        
    
    
}
