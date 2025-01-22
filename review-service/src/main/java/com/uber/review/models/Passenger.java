package com.uber.review.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "passenger")
    @Builder.Default
    private List<Booking> bookings = new ArrayList<>();
}

