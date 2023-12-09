package com.vaibhav.models.createBooking;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateBooking {

    String firstname;
    String lastname;
    int totalprice;
    boolean depositpaid;
    BookingDates bookingdates;
    String additionalneeds;
}
