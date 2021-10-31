package com.example.kanban.entities;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Comment {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long iD;

    private String content;
    private LocalDate date;


    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "developer_id")
    private Developer developer;

    public Long getID() {
        return iD;
    }

    public void setID(Long iD) {
        this.iD = iD;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }


    public Comment(String content, LocalDate date) {
        this.content = content;
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
