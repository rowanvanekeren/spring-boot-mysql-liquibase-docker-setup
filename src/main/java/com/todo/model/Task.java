package com.todo.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String task;
    private boolean done = false;

    @CreationTimestamp
    private Date created;

    @UpdateTimestamp
    private Date updated;

}
