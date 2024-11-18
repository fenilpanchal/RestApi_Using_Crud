//package com.example.G.Service;
//
//import com.example.G.Repository.Rip;
//import com.example.G.Exception.UserNotFoundException;
//import com.example.G.Model.M;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MService {
//    @Autowired
//    private Rip rip;
//    //1
//    public List<M> getM(){
//        return rip.findAll();
//    }
//    //2
//    public M getManById(Long id) {
//        return rip.findById(id)
//                .orElseThrow( ()-> new UserNotFoundException(id));
//    }
//    //3
//    public M addMByName(M m){
//        return rip.save(m);
//    }
//    //4
//    public M update(Long id,M m){
//       return rip.findById(id).map(m1 -> {
//            m1.setName(m.getName());
//            m1.setAge(m.getAge());
//            m1.setTitle(m.getTitle());
//            return rip.save(m1);
//        }).orElseThrow(()-> new RuntimeException("not found"+id));
//    }
//    //5
//    public boolean delete(Long id){
//        rip.deleteById(id);
//        return true;
//    }
//}
