//package com.example.G.Controller;
//
//import com.example.G.Model.M;
//import com.example.G.Service.MService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/max")
//
//public class M_Controller {
//    @Autowired
//    MService service;
//
//    @GetMapping
//    public List<M> getMax(){
//        return service.getM();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Long> getMaxById(@PathVariable Long id){
//          service.getManById(id);
//         return ResponseEntity.ok(id);
//    }
//
//    @PostMapping
//    public M addMaxByName(@RequestBody M m){
//        return service.addMByName(m);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<M> updateByIdAndName(@PathVariable Long id,@RequestBody M m){
//        try {
//            M max =service.update(id, m);
//            return new ResponseEntity<>(max,HttpStatus.OK);
//        }catch (RuntimeException er){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<M> deleteMById(@PathVariable Long id){
//        if (service.delete(id)){
//            service.delete(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//}
