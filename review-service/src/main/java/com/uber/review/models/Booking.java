package com.uber.review.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Review review;
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;
    private Long totalDistance;
}
