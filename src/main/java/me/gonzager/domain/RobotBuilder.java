package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.ApagarLuz;
import me.gonzager.commands.Cargar;
import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.ITarea;
import me.gonzager.commands.Info;
import me.gonzager.commands.Limpiar;

public class RobotBuilder {
    private List<ITarea> tareasAEjecutar = new ArrayList<>();

    public RobotBuilder info() {
        tareasAEjecutar.add(new Info());
        return this;
    }

    public RobotBuilder ligOn(Habitacion habitacion) {
        tareasAEjecutar.add(new EncenderLuz(habitacion));
        return this;
    }

    public RobotBuilder logOff(Habitacion habitacion) {
        tareasAEjecutar.add(new ApagarLuz(habitacion));
        return this;
    }

    public RobotBuilder clean(Habitacion habitacion) {
        tareasAEjecutar.add(new Limpiar(habitacion));
        return this;
    }

    public RobotBuilder cargar(Integer minutos) {
        tareasAEjecutar.add(new Cargar(minutos));
        return this;
    }

    public Robot build() {
        return new Robot(tareasAEjecutar);

    }
    
}

