package com.prog2;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Apartment {
    private String id;
    private String title;
    private String description;
    private long rent;
    private Status status;
    private Place place;
}
