package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "companies")
public class CompanyEntity {
    @Id
    private String Id;
    private String name;
    private String email;
    private String landLine;
    private String address;
    private String city;
    private Date registrationDate;
}
