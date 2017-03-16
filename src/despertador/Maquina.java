/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

/**
 * metodos que controlan el uso de la maquina
 *
 * @author acomesanavila
 */
public class Maquina {

    Display dis = new Display();
    /**
     * define si la alarma esta activada o no
     */
    private boolean alarma = false;

    /**
     * empieza el proceso para poner la hora de la alarma
     */
    public void setAlarma() {
        dis.alarma();
    }

    /**
     * incrementa la hora en 1
     *
     * @return
     */
    public int incrementarHora() {
        return +1;
    }

    /**
     * incrementa los minutos en 1
     *
     * @return
     */
    public int incrementarMin() {

        return +1;
    }

    /**
     * activa o desactiva la alarma
     *
     * @return
     */
    public boolean Alarmaonoff() {
        if (alarma = false) {
            alarma = true;
        } else {
            alarma = false;
        }
        return alarma;
    }

    /**
     * retorna la hora de la alarma como un valor string que luego sera
     * visualizado
     *
     * @param hora
     * @return
     */
    public String hora(String hora) {
        return (dis.hora(hora));
    }

}
