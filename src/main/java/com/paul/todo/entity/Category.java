package com.paul.todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    private Long idCategory;

    @Column
    private String nameCategory;

    @Column
    private Date fecha_creacion;



}
