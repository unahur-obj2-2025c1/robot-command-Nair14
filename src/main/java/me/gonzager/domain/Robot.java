package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.ITarea;

public class Robot {
    public static final Integer TIEMPO_MAX_CARGA_MINUTOS = 125;

    Double nivelDeBateria = 0.00;

    List<ITarea> tareasPendientes = new ArrayList<>();

    public Robot(List<ITarea> tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    List<ITarea> tareasEjecutadas = new ArrayList<>();

    public void addTareaEjecutada(ITarea tarea) {
        this.tareasEjecutadas.add(tarea);
    }

    public void removeTareaPendientes(ITarea tarea) {
        this.tareasEjecutadas.remove(tarea);
    }

    public void disminuirBateria(Double unValor) {
        nivelDeBateria = Double.max(0, nivelDeBateria - unValor);
    }

    public void cargarBateria(Double unValor) {
        nivelDeBateria = nivelDeBateria + unValor;
    }

    public Double getNivelDeBateria() {
        return nivelDeBateria;
    }

    public Double getTiempoRestante() {
        return 100 / TIEMPO_MAX_CARGA_MINUTOS * nivelDeBateria;
    }

    public List<ITarea> getTareasEjecutadas() {
        return tareasEjecutadas;
    }

    public void execute() {
        this.tareasPendientes.stream().forEach(tarea -> tarea.execute(this));
    }

}

