package com.example.journalApp.service;

import com.example.journalApp.entity.JournalEntry;
import com.example.journalApp.repository.JavaEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    @Autowired
    private JavaEntryRepository javaEntryRepository;
    //journalentryservice HAS A javaentryrepository
    public void saveEntry(JournalEntry journalEntry)
    {

        javaEntryRepository.save(journalEntry);
    }
    public List<JournalEntry> getAll()
    {
        return javaEntryRepository.findAll();
    }
    public Optional<JournalEntry> findById(ObjectId id){
        return javaEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id) {
        javaEntryRepository.deleteById(id);
    }

}
