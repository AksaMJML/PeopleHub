package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompanyDTO {
    private String Id;
    private String name;
    private String email;
    private String landLine;
    private String address;
    private String city;
    private Date registrationDate;
}
