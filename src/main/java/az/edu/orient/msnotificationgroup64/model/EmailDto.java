package az.edu.orient.msnotificationgroup64.model;

import lombok.Data;

@Data
public class EmailDto {
    private String to;
    private String subject;
    private String body;
}