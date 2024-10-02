package com.prog2;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Place {
    private PlaceType type;
    private String id;
    private String placeName;
}
