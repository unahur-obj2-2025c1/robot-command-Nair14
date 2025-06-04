package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;


public class ApagarLuz extends Tarea {
    private Habitacion habitacion;

    public ApagarLuz(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void doExecute(Robot robot) {
        habitacion.setLucesPrendidas(false);
        duracion = !habitacion.getLucesPrendidas() ? 25 : 90;
        robot.disminuirBateria(!habitacion.getLucesPrendidas() ? 1.00 : 5.00);
    }

}

