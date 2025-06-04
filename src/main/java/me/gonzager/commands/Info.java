package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Info extends Tarea {
    @Override
    public void doExecute(Robot robot) {
        var duracion = robot.getTareasEjecutadas().stream()
                .map(ITarea::duracion)
                .reduce(0, Integer::sum);
        var cantidad = robot.getTareasEjecutadas().size();
        System.out.println(duracion / cantidad);

    }

}



