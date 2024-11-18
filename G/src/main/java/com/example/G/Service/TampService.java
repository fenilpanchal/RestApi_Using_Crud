//package com.example.G.Service;
//
//import com.example.G.Exception.User_not_found;
//import com.example.G.Model.Tamp;
//import com.example.G.Repository.TampRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TampService {
//    @Autowired
//    private TampRepo tampRepo;
//
//
//    public List<Tamp> getTamp(){
//        return tampRepo.findAll();
//    }
//
//    public Tamp gatTampById(Long id){
//     return tampRepo.findById(id)
//                .orElseThrow(()->new User_not_found(id));
//    }
//
//    public Tamp createTamp(Tamp tamp){
//        return tampRepo.save(tamp);
//    }
//
//    public Tamp updateTamp(Long id,Tamp tamp){
//        return tampRepo.findById(id).map(tamp1 -> {
//            tamp1.setName(tamp.getName());
//            tamp1.setNumber(tamp.getNumber());
//            tamp1.setEmail(tamp.getEmail());
//            tamp1.setAddress(tamp.getAddress());
//            tamp1.setAge(tamp.getAge());
//            return tampRepo.save(tamp1);
//        }).orElseThrow(()->new RuntimeException("not found"+id));
//    }
//
//    public boolean deleteTamp(Long id){
//        tampRepo.deleteById(id);
//        return true;
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
