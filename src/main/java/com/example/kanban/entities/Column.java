package com.example.kanban.entities;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Set;

//@Entity @NoArgsConstructor
public class Column {
    @Id/*
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(name = "id", nullable = false)*/
    private Long id;

    //@Id @GeneratedValue
    private String nom;
/*
    @OneToMany(mappedBy = "column", orphanRemoval = true)
    private Set<ChangeLog> changeLogs;

    public Set<ChangeLog> getChangeLogs() {
        return changeLogs;
    }

    public void setChangeLogs(Set<ChangeLog> changeLogs) {
        this.changeLogs = changeLogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
*/
    public Column(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
