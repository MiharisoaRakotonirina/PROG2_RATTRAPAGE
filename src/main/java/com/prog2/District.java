package com.prog2;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class District {
    private Place place;
    private List<Building> buildingList;

    private boolean isApartmentPresent(District district, Apartment apartment) {
        return
    }

    private int getNumberOfApartments(District district) {
        return district.
    }
}
