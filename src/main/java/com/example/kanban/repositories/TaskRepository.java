package com.example.kanban.repositories;

import com.example.kanban.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tache,Long> {
}
