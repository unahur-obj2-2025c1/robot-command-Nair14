package me.gonzager.commands;

import me.gonzager.domain.Robot;

public abstract class Tarea implements ITarea {
    protected Integer duracion = 0;

    public void execute(Robot robot) {
        this.doExecute(robot);
        robot.removeTareaPendientes(this);
        robot.addTareaEjecutada(this);
    }

    public Integer duracion() {
        return duracion;
    }

    public abstract void doExecute(Robot robot);

    
}
