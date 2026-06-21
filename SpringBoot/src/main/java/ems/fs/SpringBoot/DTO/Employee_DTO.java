package ems.fs.SpringBoot.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee_DTO {

    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private Long ph;
}
