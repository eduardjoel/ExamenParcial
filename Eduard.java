
package eduard;

public class Eduard {

    public static void main(String[] args) {
        
      /*Nota: las variables "nota1a1 es NOTA 1 del Alumno 1 y Asi sucesivamente 
        con los siguientes*/
        
       int nota1a1=0, nota2a1=0,nota3a1=0;
       int nota1a2=0,nota2a2=0,nota3a2=0;
       int nota1a3=0,nota2a3=0,nota3a3=0;
       
       int suma1;
       int suma2;
       int suma3;
       
       String Estado1,Estado2,Estado3;
       
       double prom1=1,prom2=1,prom3=1;
       Estado1="REPROBADO";
       Estado2="REPROBADO";
       Estado3="REPROBADO";
       
       if (prom1>=60) Estado1="APROBADO";
       else Estado1="REPROBADO0";
       nota1a1=50;
       nota2a1=70;
       nota3a1=60;
       suma1=nota1a1+nota2a1+nota3a1;
      
       
        if (prom2>60)Estado2="APROBADO";
        else if (prom2<60)Estado2="REPROBADO";
       nota1a2=50;
       nota2a2=60;
       nota3a2=55;
       suma2=nota1a2+nota2a2+nota3a2;
      
      
       if (prom3>60)Estado3="APROBADO";
       else if (prom3<60)Estado3="REPROBADO";
       nota1a3=90;
       nota2a3=80;
       nota3a3=70;
       suma3=nota1a3+nota2a3+nota3a3;
     
       
       
       prom1=(suma1)/3.0;
       prom2=(suma2)/3.0;
       prom3=(suma3)/3.0;
       
System.out.println("NL"+"\t"+"NOMBRE"+"\t"+"NOTA1"+"\t"+"NOTA2"+"\t"+"NOTA3"+
                   "\t"+"SUMA"+"\t"+"PROMEDIO"+"\t"+""+"ESTADO");
System.out.println("====================================================="
                   + "============================");
System.out.println(1+"\t"+"Elmer"+"\t"+nota1a1+"\t"+nota2a1+"\t"+nota3a1+"\t"+
                   suma1+"\t"+prom1+"\t" +Estado1);
System.out.println(1+"\t"+"Sandra"+"\t"+nota1a2+"\t"+nota2a2+"\t"+nota3a2+"\t"+
                   suma2+"\t"+prom2+"\t" +Estado2);
System.out.println(1+"\t"+"Juan"+"\t"+nota1a3+"\t"+nota2a3+"\t"+nota3a3+"\t"+
                   suma3+"\t"+prom3+"\t" +Estado3);
System.out.println("====================================================="
                   + "============================");

       /*He intentado de varias Maneras y no puedo hacer que me cambie el 
        estado de reprobado a Aprobado al momento de correr el Programa
        ya he cambiado variables, ciclos, los he organidado de varias maneras
        y sigue sin cambiar.*/
    }
    
}
