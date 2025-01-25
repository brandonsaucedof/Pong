
package clases;

import javax.swing.*;

import control.EngineGraphics;

public class Ventana extends JFrame {

    Tablero canvas;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("PING PONG UPDS_LOS GAMERS");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero();
        add(canvas);

        addKeyListener(new EventoTeclado());
        new EngineGraphics(canvas).start();
    }

}
