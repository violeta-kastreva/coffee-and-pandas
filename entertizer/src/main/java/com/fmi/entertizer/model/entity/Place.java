package com.fmi.entertizer.model.entity;

import com.fmi.entertizer.model.entity.enums.PlaceType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="place")
public class Place extends BaseEntity{


    @Enumerated(EnumType.STRING)
    private PlaceType type;

    @Column
    private String description;

    @Column(nullable = false)
    private String coordinates;

    @OneToOne(mappedBy ="place")
    private Event event;

    @OneToMany(
            mappedBy = "place",
            cascade = CascadeType.ALL
    )
    private List<UserPlace> placeUser = new ArrayList<>();

    public Place(PlaceType type, String description, String coordinates) {
        this.type = type;
        this.description = description;
        this.coordinates = coordinates;
    }

    public Place() {
    }

    public PlaceType getType() {
        return type;
    }

    public void setType(PlaceType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
