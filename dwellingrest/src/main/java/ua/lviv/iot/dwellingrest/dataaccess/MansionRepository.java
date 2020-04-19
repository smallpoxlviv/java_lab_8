package ua.lviv.iot.dwellingrest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.dwellingrest.model.Mansion;

@Repository
public interface MansionRepository extends JpaRepository<Mansion, Integer> {

}
