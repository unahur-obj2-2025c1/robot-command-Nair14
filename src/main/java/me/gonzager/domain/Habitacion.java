package me.gonzager.domain;

public class Habitacion {
    private Boolean lucesPrendidas;
    private final Integer metrosCuadados;

    public Habitacion(Boolean lucesPrendidas, Integer metrosCuadados) {
        this.lucesPrendidas = lucesPrendidas;
        this.metrosCuadados = metrosCuadados;
    }

    public Boolean getLucesPrendidas() {
        return lucesPrendidas;
    }

    public void setLucesPrendidas(Boolean lucesPrendidas) {
        this.lucesPrendidas = lucesPrendidas;
    }

    public Integer getMetrosCuadados() {
        return metrosCuadados;
    }

}

