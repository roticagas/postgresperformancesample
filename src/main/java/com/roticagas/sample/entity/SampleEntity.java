package com.roticagas.sample.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class SampleEntity {
    @Id
    private Long id;
    @Column("name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SampleEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static SampleEntity build(String name) {
        SampleEntity entity = new SampleEntity();
        entity.setName(name);
        return entity;
    }
}
