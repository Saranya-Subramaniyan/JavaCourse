package com.spring.SpringMVC.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name="student")
public class Student {
    @Id
    private int id;
    @Column
    private String sname;
    @Column
    private int mark;

}
