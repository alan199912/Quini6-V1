
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
        
        //scanner
        Scanner lector = new Scanner(System.in);
        
        //random
        Random random = new Random();
        
        //inicializacion
        int [] quini6 = new int [6];
        int [] sorteo = new int [6];
        int [] acierto = new int [6];
        int encontrado = 0;
        String [] nombre_usuario = new String[1];
        int monto = 0;
        int montoFinal = 0;
        
        //cartel de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al Quini6","INFORMATION_MESSAGE,",JOptionPane.INFORMATION_MESSAGE);
        
        //ingreso
        for (int a = 0; a < 1; a++) {
        //ingresa el nombre de usuraio
        nombre_usuario[a]=JOptionPane.showInputDialog(a+1+"- Ingrese nombre de usuario");
            
        //el usuario ingresa el monto
        do{
            monto=Integer.parseInt(JOptionPane.showInputDialog(a+1+"- Usuario "+nombre_usuario[a]+" Ingrese monto a jugar "));
            if (monto<0) {
                //mensaje de error
                        JOptionPane.showMessageDialog(null, "Error","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null," Usuario "+nombre_usuario[a]+" Asegurese de ingresar un monto existente","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            }
        }while(monto<0);
                    
        //muestra el nombre del usuario
        JOptionPane.showMessageDialog(null,"Usuario: "+nombre_usuario[a]);
                    
            //for para ingresar los numeros elegidos por el cliente
            for (int i = 0; i < quini6.length; i++) {

                do{
                    //ingresamos el numero
                    quini6[i]=Integer.parseInt(JOptionPane.showInputDialog(i+1+"- Ingrese los numeros (del 1 al 45)"));

                    //numero menor o mayor a 0 o 45
                    if(quini6[i]<0 || quini6[i]>45) {
                        //mensaje de error
                        JOptionPane.showMessageDialog(null, "Error","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null," Usuario "+nombre_usuario[a]+" Asegurese de ingresar un numero del 1 al 45","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
                    }

                    //numero repetido
                    for (int j = 0; j < i; j++) {
                        if(quini6[i]==quini6[j]) {
                            //si encuentra un valor igual se resta un i haciendo que repita el numero random
                            i--;
                            JOptionPane.showMessageDialog(null, "Error","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
                            JOptionPane.showMessageDialog(null," Usuario "+nombre_usuario[a]+" Numero ya ingresado","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
                            JOptionPane.showMessageDialog(null,"Asegurese de no repetir numero","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }while(quini6[i]<0 || quini6[i]>45);
            }        
        }
        //numero random
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = 1+random.nextInt(45);
            //hacemos un doble for para que no se repita un numero random
            for (int j = 0; j < i; j++) {
                if(sorteo[i]==sorteo[j]) {
                    //si encuentra un valor igual se resta un i haciendo que repita el numero random
                    i--;
                }
            }
        }
        //metodo burbuja
        Arrays.sort(quini6);
        Arrays.sort(sorteo);
        
        //girar el bolillero
        JOptionPane.showMessageDialog(null,"Monto de: ·$"+monto,"INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Girando el bolillero.","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Girando el bolillero..","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Girando el bolillero...","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
       //Numeros ingresados comparados con los del usuario
        for (int i = 0; i < 1; i++) {     
            JOptionPane.showMessageDialog(null,"El usuario "+nombre_usuario[0]+" Ingreso "+quini6[0]+" y salieron "+sorteo[0]+
            "\n"+"El usuario "+nombre_usuario[0]+" Ingreso "+quini6[1]+" y salieron "+sorteo[1]+
            "\n"+"El usuario "+nombre_usuario[0]+" Ingreso "+quini6[2]+" y salieron "+sorteo[2]+
            "\n"+"El usuario "+nombre_usuario[0]+" Ingreso "+quini6[3]+" y salieron "+sorteo[3]+
            "\n"+"El usuario "+nombre_usuario[0]+" Ingreso "+quini6[4]+" y salieron "+sorteo[4]+
            "\n"+"El usuario "+nombre_usuario[0]+" Ingreso "+quini6[5]+" y salieron "+sorteo[5]);
        }
        
        //para comparar y mostrar los numeros acertados
        for (int i = 0; i < 6; i++) {
            if (quini6[i] == sorteo[0]) {
                acierto[i]=quini6[i];
                encontrado++;
            }
            if (quini6[i] == sorteo[1]) {
                acierto[i]=quini6[i];
                encontrado++;
            }
            if (quini6[i] == sorteo[2]) {
                acierto[i]=quini6[i];
                encontrado++;
            }
            if (quini6[i] == sorteo[3]) {
                acierto[i]=quini6[i];
                encontrado++;
            }
            if (quini6[i] == sorteo[4]) {
                acierto[i]=quini6[i];
                encontrado++;
            }
            if (quini6[i] == sorteo[5]) {
                acierto[i]=quini6[i];
                encontrado++;
            }   
        }
        
        //numeros acertados
        for (int i = 0; i < 1; i++) {
              JOptionPane.showMessageDialog(null,"El usuario "+nombre_usuario[0]+" ha acertado a "+encontrado+" numeros");  
        }
        
        //mostrar si gano o que siga participando
        for (int i = 0; i < 1; i++) {
                
            if (encontrado==5) {
                //70%
                montoFinal=(monto*70/100)+monto;
                JOptionPane.showMessageDialog(null,"Felicitaciones "+nombre_usuario[0]+ " ha Ganado $"+montoFinal);
            }
            if (encontrado==4) {
                //15%
                montoFinal=(monto*15/100)+monto;
                JOptionPane.showMessageDialog(null,"Felicitaciones "+nombre_usuario[0]+ " ha Ganado $"+montoFinal);
            }
            if (encontrado==3) {
                //5%
                montoFinal=(monto*5/100)+monto;
                JOptionPane.showMessageDialog(null,"Felicitaciones "+nombre_usuario[0]+ " ha Ganado $"+montoFinal);
            }
            if (encontrado==2) {
                //3%
                montoFinal=monto*3/100;
                JOptionPane.showMessageDialog(null,"Usuario "+nombre_usuario[0]+ " ha Ganado $"+montoFinal);
            }
            if (encontrado==1) {
                //1%
                montoFinal=monto*1/100;
                JOptionPane.showMessageDialog(null,"Usuario "+nombre_usuario[0]+ " ha Ganado $"+montoFinal);
            }
            //siga participando    
            if (encontrado<4) {
                JOptionPane.showMessageDialog(null,"Usuario "+nombre_usuario[0]+ " Siga participando");
            }
        }
    }   
}