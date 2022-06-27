package com.example.controller;

import com.example.bean.ResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author michael
 */
@RestController
@RequestMapping("/")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<ResponseObject> healthCheck() {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setMessage("Application is running...");
        responseObject.setCode(200);
        return new ResponseEntity<>(responseObject, HttpStatus.OK);
    }
}
