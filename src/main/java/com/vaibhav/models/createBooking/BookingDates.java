package com.vaibhav.models.createBooking;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingDates {

    String checkin;
    String checkout;
}
