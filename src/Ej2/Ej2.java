package Ej2;

import Ej2.servicios.CasaServicio;
import Ej2.servicios.ClienteServicio;
import Ej2.servicios.ComentarioServicio;
import Ej2.servicios.EstanciaServicio;
import Ej2.servicios.FamiliaServicio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ComentarioServicio CoS = new ComentarioServicio();
        ClienteServicio ClS = new ClienteServicio();
        CasaServicio CaS = new CasaServicio();
        FamiliaServicio FS = new FamiliaServicio();
        EstanciaServicio ES = new EstanciaServicio();

        // a) Listar familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
        //*
        
        try {
        
            FS.imprimirFamiliasHijosMinimosEdadMaximaInferior(3,10); 
            
        } catch (Exception e){
            
            throw e;
            
        }
        
        
         //*/
        
        // b) Listar casas disponibles el 1/08/2020 y el 31/08/2020.

        /*
        
        CaS.imprimirCasasDisponibles( "2020/08/01", "2020/08/30", "Reino Unido");
        
         */
        
        //c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
        
        /*
        
        FS.imprimirFamiliasCorreo("hotmail");

        */

        //d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha 
        //dada y un número de días específico.
        
        /*
        
        String D1 = "2020/08/25";
        
        String anio = D1.substring(0, 4);
        String mes = D1.substring(5, 7);
        String dia = D1.substring(8, 10);
        
        int diaNumber = Integer.parseInt(dia);
        int mesNumber = Integer.parseInt(mes);
        int anioNumber = Integer.parseInt(anio);
        
        Date D11 = new Date(anioNumber - 1900, mesNumber - 1, diaNumber); 

        System.out.println(D11);
        
        int DiasExtra = 20;
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.setTime(D11); // Configuramos la fecha que se recibe
	
        calendar.add(Calendar.DAY_OF_YEAR, DiasExtra);  // numero de días a añadir, o restar en caso de días<0
	
        Date D2 = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
        
        System.out.println(D2);
        
        System.out.println(D2);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        String D2String = dateFormat.format(D2);
        
        System.out.println(D2String);
        
        CaS.imprimirCasasDisponibles(D1, D2String );

        */
        
        /*
        
        Nota:En el ej anterio faltó considerar (por razonamiento) que tiempo_maximo debe ser
        menor que diasExtra
        
        */
                
        //e) Listar los datos de todos los clientes que en algún momento realizaron una estancia 
        //y la descripción de la casa donde la realizaron.
        
        //ES.imprimirEstanciasCruzadas();
        
        //f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, 
        //país y ciudad del cliente y además la información de la casa que reservó. La que 
        //reemplazaría a la anterior
        
        //g) Debido a la devaluación de la libra esterlina con respecto al euro se desea 
        //incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar 
        //los precios actualizados.
        
        //h) Obtener el número de casas que existen para cada uno de los países diferentes.
        
        //i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas 
        //(comentarios) que están ‘limpias’.
        
        //j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
        
        //Para finalizar, pensar junto con un compañero cómo sería posible optimizar las tablas de 
        //la BD para tener un mejor rendimiento.
    }

}
