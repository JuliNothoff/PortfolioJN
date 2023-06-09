
package com.JulietaNothoff.Portfolio.service;

import com.JulietaNothoff.Portfolio.entity.Hys;
import com.JulietaNothoff.Portfolio.repository.RHys;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julie
 */

@Service
@Transactional
public class SHys {
    
    @Autowired 
    RHys rHys;
    
    public List<Hys> list(){
        return rHys.findAll();
    }
    
    public Optional<Hys> getOne( int id) {
        return rHys.findById(id);
    }
    
    public void save(Hys hys){
        rHys.save(hys);
    }
    
    public void delete(int id){
        rHys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHys.existsById(id);
    }
    
}
