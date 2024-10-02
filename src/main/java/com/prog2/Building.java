package com.prog2;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Building {
    private Place place;
    private int numberOfFloors;
    private List<Apartment> apartmentList;
}
