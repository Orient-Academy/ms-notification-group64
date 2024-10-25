package az.edu.orient.msnotificationgroup64.controller;

import az.edu.orient.msnotificationgroup64.model.EmailDto;
import az.edu.orient.msnotificationgroup64.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendemail")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public String sendEmail(@RequestBody EmailDto emailDto){
        emailService.sendEmail(emailDto.getTo(),emailDto.getSubject(),emailDto.getBody());
        return "OK";
    }
}
