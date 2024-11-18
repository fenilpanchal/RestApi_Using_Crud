//package com.example.G.Controller;
//
//import com.example.G.Model.Tamp;
//import com.example.G.Service.TampService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/tamp")
//public class TampController {
//
//    @Autowired
//    private TampService tampService;
//
//    @GetMapping
//    public List<Tamp> getTamp(){
//        return tampService.getTamp();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Long> gatTampById(@PathVariable Long id){
//        tampService.gatTampById(id);
//        return ResponseEntity.ok(id);
//    }
//
//    @PostMapping
//    public Tamp createTampByName(@RequestBody Tamp tamp){
//        return tampService.createTamp(tamp);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Tamp> updateTamp(@PathVariable Long id,@RequestBody Tamp tamp){
//        try {
//            Tamp user = tampService.updateTamp(id, tamp);
//            return new ResponseEntity<>(user, HttpStatus.OK);
//
//        }catch (RuntimeException e){
//            return new ResponseEntity<>( HttpStatus.OK);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Tamp> deleteTamp(@PathVariable Long id){
//        if (tampService.deleteTamp(id)){
//            tampService.deleteTamp(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//}
