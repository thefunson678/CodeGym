package com.example.ex8_1_register_form.models;

import com.example.ex8_1_register_form.utils.IAgeConstraint;
import jakarta.persistence.*;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDate;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code",columnDefinition = "INT")
    private Integer code;
    @Column(name = "first_name",columnDefinition = "VARCHAR(45)")
    @NotEmpty(message = "Fist name is required")
    @Pattern(regexp = "[^0-9,<.>/?;:'\"{}+\\-*/=)(*&^%$#@!~\\s]{4,45}$", message = "Only letter, no space, no special character, 4-45 length!")
    private String firstName;
    @Column(columnDefinition = "VARCHAR(45)")
    @NotEmpty(message = "Last name is required")
    @Pattern(regexp = "[^0-9,<.>/?;:'\"{}+\\-*/=)(*&^%$#@!~]{5,45}$", message = "Only letter, space, , no special character, 4-45 length !")
    private String lastName;
    @Pattern(regexp = "0[0-9]{8,15}$" , message = "Phone format not correct. Must be 9-15 number, start with 0 and number only. Example: 0325964218")
    private String phoneNumber;
    @IAgeConstraint
    @PastOrPresent(message = "Day of future")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate dob;
    @Pattern(regexp = "^\\w+(@gmail.com|@hotmail.com)$",message = "Email format not support or include special characters. Support @gmail.com, @hotmail.com")
    @NotEmpty(message = "Required")
    @Email(message = "Email need @")
    private String userEmail;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public User() {

    }

}
