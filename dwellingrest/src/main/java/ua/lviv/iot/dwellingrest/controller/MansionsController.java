package ua.lviv.iot.dwellingrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.dwellingrest.business.MansionService;
import ua.lviv.iot.dwellingrest.model.Mansion;

@RequestMapping("/mansions")
@RestController
public class MansionsController {

    @Autowired
    private MansionService mansionService;
    
    @GetMapping
    public List<Mansion> getMansions() {
        return mansionService.getMansions();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Mansion> getMansion(final @PathVariable("id") Integer mansionId) {
        Mansion mansion = mansionService.getMansion(mansionId);
        return mansion != null ? 
                new ResponseEntity<Mansion>(mansion, HttpStatus.OK)
                : new ResponseEntity<Mansion>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Mansion createMansion(final @RequestBody Mansion mansion) {
        return mansionService.createMansion(mansion);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Mansion> deleteMansion(final @PathVariable("id") Integer mansionId) {
        HttpStatus status = mansionService.deleteMansion(mansionId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }
    
    @PutMapping(path = "/{id}")
    public ResponseEntity<Mansion> updateMansion(final @PathVariable("id") Integer mansionId,
            final @RequestBody Mansion mansion) {
        Mansion previonsMansion = mansionService.updateMansion(mansionId, mansion);
        return previonsMansion  == null
                ? new ResponseEntity <Mansion> (HttpStatus.NOT_FOUND)
                : new ResponseEntity <Mansion> (previonsMansion, HttpStatus.OK);
        
    }
}