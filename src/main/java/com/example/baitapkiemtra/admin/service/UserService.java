package com.example.baitapkiemtra.admin.service;

import com.example.baitapkiemtra.admin.models.Users;
import com.example.baitapkiemtra.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAll() {
        return this.userRepository.findAll();
    }


    public Boolean create(Users users) {
        try{
            this.userRepository.save(users);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public Users findById(String  id) {
        return this.userRepository.findById(Long.valueOf(id)).get();
    }


    public Boolean update(Users users) {
        try{
            this.userRepository.save(users);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public boolean delete(String id) {
        try{
            this.userRepository.delete(findById(id));
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }




    public Page<Users> getAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1,5);
        return this.userRepository.findAll(pageable);
    }


//    public Page<CategoryEvent> searchEvent(String keyword, Integer pageNo) {
//        List list  = this.searchEvent(keyword);
//        Pageable pageable = PageRequest.of(pageNo-1,3);
//        Integer start =(int) pageable.getOffset();
//        Integer end = (int)((pageable.getOffset() + pageable.getPageSize() )>list.size() ? list.size() : pageable.getOffset() +pageable.getPageSize());
//        list = list.subList(start,end);
//        return new PageImpl<CategoryEvent>(list,pageable ,this.searchEvent(keyword).size());
//    }
}
