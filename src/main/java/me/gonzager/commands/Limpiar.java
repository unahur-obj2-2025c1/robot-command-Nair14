package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {
    private Habitacion habitacion;

    public Limpiar(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void doExecute(Robot robot) {
        duracion = 180 * habitacion.getMetrosCuadados();
        robot.disminuirBateria(5.00 * habitacion.getMetrosCuadados());
    }

}

