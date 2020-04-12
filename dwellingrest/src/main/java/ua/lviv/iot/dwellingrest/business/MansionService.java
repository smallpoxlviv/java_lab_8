package ua.lviv.iot.dwellingrest.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dwellingrest.dataaccess.MansionRepository;
import ua.lviv.iot.dwellingrest.model.Mansion;

@Service
public class MansionService {
    
    @Autowired
    private MansionRepository mansionRepository;
    
    public Mansion createMansion(Mansion mansion) {
        return mansionRepository.save(mansion);
    }
    
    public List<Mansion> getMansions(){
        return mansionRepository.findAll();
    }
    
    public Mansion getMansion(Integer id) {
        return mansionRepository.existsById(id) ? mansionRepository.findById(id).get() : null;
    }
    
    public boolean deleteMansion (Integer id) {
        if (mansionRepository.existsById(id)) {
            mansionRepository.deleteById(id);
            return true;
        } 
        else {
            return false;
        }
    }
    
    public Mansion updateMansion(Integer id, Mansion mansion) {
        if (mansionRepository.existsById(id)) {
            mansion.setId(id);
            Mansion tempMansion = mansionRepository.findById(id).get();
            Mansion previousMansion = new Mansion(tempMansion.getAreaInSquareMeters(), 
                    tempMansion.getPriceInUSD(), tempMansion.getDistrict(),
                    tempMansion.getBalconyCount(), tempMansion.getEntranceDoorCount());
            previousMansion.setId(id);
            mansionRepository.save(mansion);
            return previousMansion;
        } else {
            return null;
        }
    }   
}
