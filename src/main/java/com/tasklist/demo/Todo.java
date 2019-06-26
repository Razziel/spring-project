package com.tasklist.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Todo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Todo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "completed", nullable = false)
    private boolean completed;
}
