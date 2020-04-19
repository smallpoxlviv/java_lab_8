package ua.lviv.iot.dwellingrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mansion {

    private double areaInSquareMeters;
    private double priceInUSD;
    private String district;
    private int allRoomsCount;
    private int balconyCount;
    private int kitchenCount;
    private int restroomCount;
    private int floorCount;
    private int windowsCount;
    private boolean poolAvability;
    private boolean garageAvability;
    private double areaOfLandInSquareMeters;
    private int entranceDoorCount;
    private boolean otherBuildingsInArea;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   
    public Mansion() {

    }

    public Mansion(double areaInSquareMeters, double priceInUSD, String district, int balconyCount, int entranceDoorCount) {
        this.areaInSquareMeters = areaInSquareMeters;
        this.priceInUSD = priceInUSD;
        this.district = district;
        this.balconyCount = balconyCount;
        this.entranceDoorCount = entranceDoorCount;
    }

    public double getAreaInSquareMeters() {
        return areaInSquareMeters;
    }

    public void setAreaInSquareMeters(double areaInSquareMeters) {
        this.areaInSquareMeters = areaInSquareMeters;
    }

    public double getPriceInUSD() {
        return priceInUSD;
    }

    public void setPriceInUSD(double priceInUSD) {
        this.priceInUSD = priceInUSD;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getAllRoomsCount() {
        return allRoomsCount;
    }

    public void setAllRoomsCount(int allRoomsCount) {
        this.allRoomsCount = allRoomsCount;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public int getKitchenCount() {
        return kitchenCount;
    }

    public void setKitchenCount(int kitchenCount) {
        this.kitchenCount = kitchenCount;
    }

    public int getRestroomCount() {
        return restroomCount;
    }

    public void setRestroomCount(int restroomCount) {
        this.restroomCount = restroomCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    public boolean isPoolAvability() {
        return poolAvability;
    }

    public void setPoolAvability(boolean poolAvability) {
        this.poolAvability = poolAvability;
    }

    public boolean isGarageAvability() {
        return garageAvability;
    }

    public void setGarageAvability(boolean garageAvability) {
        this.garageAvability = garageAvability;
    }

    public double getAreaOfLandInSquareMeters() {
        return areaOfLandInSquareMeters;
    }

    public void setAreaOfLandInSquareMeters(double areaOfLandInSquareMeters) {
        this.areaOfLandInSquareMeters = areaOfLandInSquareMeters;
    }

    public int getEntranceDoorCount() {
        return entranceDoorCount;
    }

    public void setEntranceDoorCount(int entranceDoorCount) {
        this.entranceDoorCount = entranceDoorCount;
    }

    public boolean isOtherBuildingsInArea() {
        return otherBuildingsInArea;
    }

    public void setOtherBuildingsInArea(boolean otherBuildingsInArea) {
        this.otherBuildingsInArea = otherBuildingsInArea;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
