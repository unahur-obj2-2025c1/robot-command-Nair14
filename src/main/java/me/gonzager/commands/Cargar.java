package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    private Integer minutos;

    public Cargar(Integer minutos) {
        if (minutos > Robot.TIEMPO_MAX_CARGA_MINUTOS || minutos < 0)
            throw new IllegalArgumentException("Paramétro minutos incorrecto.");
        this.minutos = minutos;
    }

    @Override
    public void doExecute(Robot robot) {
        var tiempoMaximaACargarEnMinutos = Robot.TIEMPO_MAX_CARGA_MINUTOS - robot.getTiempoRestante() * 60;
        var duracionEnMinutos = Double.min(minutos, tiempoMaximaACargarEnMinutos);
        robot.cargarBateria(duracionEnMinutos * 100 / Robot.TIEMPO_MAX_CARGA_MINUTOS);
    }

    

}
