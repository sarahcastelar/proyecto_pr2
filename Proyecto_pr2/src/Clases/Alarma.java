package Clases;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import proyecto_pr2.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan Luis Jimenez
 */
public class Alarma extends SwingWorker<Void, Void> {

    private int hora;
    private int minuto;
    private boolean activado;
    private JLabel Estado;
    principalProyecto obj = new principalProyecto();

    int hour;
    int minute;

    public Alarma(JLabel Estado, int hora, int minuto) {
        this.Estado = Estado;
        this.hora = hora;
        this.minuto = minuto;
        activado = true;

    }

    public void reproducir(String ruta) {
        try {
            FileInputStream fis;
            Player player;
            fis = new FileInputStream(ruta);
            BufferedInputStream bis = new BufferedInputStream(fis);

            player = new Player(bis); // Llamada a constructor de la clase Player
            
            player.play();          // Llamada al método play
            

            
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void desactivar() {
        activado = false;
    }

    public void Mostrar() {
        JOptionPane.showMessageDialog(null, "Atención!!!", "Despierta", 2);
        desactivar();
    }

    protected Void doInBackground() throws Exception {
        int[] momentoactual = new int[2];

        while ((activado) && (!isDone())) {
            momentoactual = MinutoHora.getHoraMinutoActual();
            if ((momentoactual[0] == hora) && (momentoactual[1] == minuto)) {

                //reproducir("audio/audio.mp3");
                Mostrar();

            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
            if (isCancelled()) {
                obj.Estado.setText("Cancelado");
            }

        }
        return null;
    }

}
