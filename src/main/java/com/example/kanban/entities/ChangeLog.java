package com.example.kanban.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ChangeLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate occured;
/*
    @ManyToOne
    @JoinColumn(name = "column_id")
    private Column column;

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    /*
    @ManyToOne
    @JoinColumn(name = "tache_id")
    private Tache tache;

    @ManyToOne
    @JoinColumn(name = "column_id")
    private Column column;


    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }


     */
    public ChangeLog(LocalDate occured) {
        this.occured = occured;
    }

    public LocalDate getOccured() {
        return occured;
    }

    public void setOccured(LocalDate occured) {
        this.occured = occured;
    }
}
