package com.dee.employeewellbeingapp;

import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Data
class EmployeeWellbeingAppApplicationTests {
    private String name;

    @Test
    void contextLoads() {
        EmployeeWellbeingAppApplicationTests obj= new EmployeeWellbeingAppApplicationTests();
        obj.setName("Lombok Working!");
        System.out.println(obj.getName());
    }

}
