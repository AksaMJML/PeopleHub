package model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String registrationDate;
}
