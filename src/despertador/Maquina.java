/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

/**
 * methods that control how the machine work
 *
 * @author acomesanavila
 */
public class Maquina {

    Display dis = new Display();
    /**
     * alarm is on or off
     */
    private boolean alarma = false;

    /**
     * start the alarms procedure
     */
    public void setAlarma() {
        dis.alarma();
    }

    /**
     * increase hour in 1
     *
     * @return
     */
    public int incrementarHora() {
        return +1;
    }

    /**
     * increase min in 1
     *
     * @return
     */
    public int incrementarMin() {

        return +1;
    }

    /**
     * put the alarm on/off
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
     *
     * return the hour
     *
     * @param hora
     * @return
     */
    public String hora(String hora) {
        return (dis.hora(hora));
    }

}
