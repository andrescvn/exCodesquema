/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Despertador {

    /**
     * se llaman a los metodos
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Maquina maq = new Maquina();
        int min = 0;
        int hora = 0;
        int op;

        maq.setAlarma();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1-incrementar min \n2-incrementar horas \n 3-fin modificar"));
            switch (op) {
                case 1:
                    min = min + maq.incrementarMin();
                    if (min == 60) {
                        min = 0;
                    }
                    System.out.println(maq.hora(hora + ":" + min));
                    break;
                case 2: {
                    hora = hora + maq.incrementarHora();
                    if (hora == 24) {
                        hora = 0;
                    }
                    System.out.println(maq.hora(hora + ":" + min));
                    break;
                }
                //el usuario activa los botones de incrementarhora/min cambiando la hora    
            }
        } while (op != 3);
        maq.setAlarma();//Se activa la alarma
    }

}
