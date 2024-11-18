//package com.example.G.Exception;
//
//import jakarta.persistence.Entity;
//import org.springframework.http.HttpCookie;
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
//public class Global_Exception {
//    @ExceptionHandler(User_not_found.class)
//    public ResponseEntity<Map<String ,Object>> U (
//            User_not_found user, WebRequest webRequest){
//
//        Map<String,Object> recourse = new HashMap<>();
//
//        recourse.put("Status", HttpStatus.NOT_FOUND.value());
//        recourse.put("Error","Not Found");
//        recourse.put("Message",user.getMessage());
//
//        return new ResponseEntity<>(recourse,HttpStatus.NOT_FOUND);
//    }
//}
