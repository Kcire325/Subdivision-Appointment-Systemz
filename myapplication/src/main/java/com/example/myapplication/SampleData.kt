package com.example.myapplication

import androidx.compose.runtime.mutableStateListOf

// Facilities available for booking
val availableFacilities = listOf(
    Facility(1, "Chapel", "⛪"),
    Facility(2, "Basketball Court", "🏀"),
    Facility(3, "Multipurpose Hall", "🏛️"),
    Facility(4, "Tennis Court", "🎾")
)

// Time slots for the picker
val timeSlots = listOf(
    "8:00 AM - 9:00 AM", "9:00 AM - 10:00 AM", "10:00 AM - 11:00 AM", "11:00 AM - 12:00 NN",
    "12:00 NN - 1:00 PM", "1:00 PM - 2:00 PM", "2:00 PM - 3:00 PM", "3:00 PM - 4:00 PM",
    "4:00 PM - 5:00 PM", "5:00 PM - 6:00 PM", "6:00 PM - 7:00 PM", "7:00 PM - 8:00 PM",
    "8:00 PM - 9:00 PM", "9:00 PM - 10:00 PM", "10:00 PM - 11:00 PM"
)

// The reactive list that stores reservations during the session - CLEARED
val calendarEvents = mutableStateListOf<CalendarEvent>()

// The reactive list that stores community events for the home screen
val sampleEvents = mutableStateListOf<CommunityEvent>(
    CommunityEvent(
        id = 1,
        title = "Community Meeting",
        timeRange = "Fri, Jan 5 9:00 AM – 12:00 PM",
        description = "Monthly community gathering for all residents.",
        schedules = listOf(EventSchedule("January 5, 2026", "9:00 AM - 12:00 PM", "Barangay Hall"))
    )
)
