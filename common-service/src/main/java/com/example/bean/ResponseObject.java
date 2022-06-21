package com.example.bean;

import lombok.Data;

@Data
public class ResponseObject {
    String message;
    Integer code;
    String jwtToken;
}
