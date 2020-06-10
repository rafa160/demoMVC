package com.register.demo.models;

import com.register.demo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull
    @Size(min = 1,message = "is required")
    private String lastName;

    @NotNull
    @Min(value =0, message = "Must be greater than or equal to zero")
    @Max(value = 7, message = "must be less than or equal to 10")
    private int workday;

    @Pattern(regexp = "^[a-zA-Z0-9]{8}", message = "only 8 chars/digits")
    private String postalCode;

    @CourseCode(value="BR", message = "Must start with BR")
    private String courseCode;

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

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
