package com.event.eventManagment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.event.eventManagment.Repository.EventRepository;
import com.event.eventManagment.model.Event;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add); // safe way to avoid null issues
        return events;
    }
}
