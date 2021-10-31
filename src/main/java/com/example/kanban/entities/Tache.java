package com.example.kanban.entities;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Set;

@Entity @NoArgsConstructor
public class Tache {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long iD;

    private String title;
    private LocalDate Date;
    private Integer nbHourPrevues;
    private Integer nbHourEfectives;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToMany
    @JoinTable(name = "tache_developers",
            joinColumns = @JoinColumn(name = "tache_id"),
            inverseJoinColumns = @JoinColumn(name = "developers_id"))
    private Set<Developer> developers;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "type_tache_Id")
    private TypeTache typeTache;

    public TypeTache getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(TypeTache typeTache) {
        this.typeTache = typeTache;
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    public Long getID() {
        return iD;
    }

    public void setID(Long iD) {
        this.iD = iD;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Tache(String title, LocalDate date, Integer nbHourPrevues, Integer nbHourEfectives) {
        this.title = title;
        Date = date;
        this.nbHourPrevues = nbHourPrevues;
        this.nbHourEfectives = nbHourEfectives;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public Integer getNbHourPrevues() {
        return nbHourPrevues;
    }

    public void setNbHourPrevues(Integer nbHourPrevues) {
        this.nbHourPrevues = nbHourPrevues;
    }

    public Integer getNbHourEfectives() {
        return nbHourEfectives;
    }

    public void setNbHourEfectives(Integer nbHourEfectives) {
        this.nbHourEfectives = nbHourEfectives;
    }
}
