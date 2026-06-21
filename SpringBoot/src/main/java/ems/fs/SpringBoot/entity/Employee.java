package ems.fs.SpringBoot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table( name= "ems")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "First_Name")
    private String first_name;
    @Column(name = "Last_Name")
    private String last_name;
    @Column(name = "Email" , nullable = false , unique = true)
    private String email;
    @Column(name = "Ph", nullable = false, unique = true)
    private Long ph;
}
