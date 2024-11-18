//package com.example.G.Exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<Map<String,Object >> u(
//            UserNotFoundException userNotFoundException, WebRequest webRequest){
//        Map<String, Object> response = new HashMap<>();
//
//        response.put("Status", HttpStatus.NOT_FOUND.value());
//        response.put("Error","Not Found");
//        response.put("Message",userNotFoundException.getMessage());
//
//        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
//    }
//}
