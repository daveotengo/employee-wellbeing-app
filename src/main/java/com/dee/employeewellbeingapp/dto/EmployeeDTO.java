package com.dee.employeewellbeingapp.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {


    private Long Id;

    private String name;

    private List<String> wellBeingProgrammes;
}
