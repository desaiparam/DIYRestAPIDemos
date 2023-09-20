package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.request.StudentRequest;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "studentsequence", sequenceName = "studentsequence", allocationSize = 1)
@Table(name = "student")
@NoArgsConstructor
public class StudentVO{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator = "studentsequence")
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @JoinColumn(name = "classes_id")
//    @OneToOne
//    private ClassesVO classesVO;

    public StudentVO(StudentRequest studentRequest) {
        this.firstName=studentRequest.getFirstName();
        this.lastName = studentRequest.getLastName();
    }
}
