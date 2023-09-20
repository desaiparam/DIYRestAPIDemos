package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "studentsequence", sequenceName = "studentsequence", allocationSize = 1)
@Table(name = "classes")
public class ClassesVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "studentsequence")
    @Column(name = "id")
    private int classId;

    @Column(name = "classes")
    private String className;

    @JoinColumn(name = "students_id")
    @ManyToOne
    private StudentVO studentVO;

}
