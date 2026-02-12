package com.example.simpletask.Services;

import com.example.simpletask.Models.Entity.SearchEntity;
import com.example.simpletask.Models.Repositories.SearchRepository;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public final SearchRepository searchRepository;

    public SearchService(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    public SearchEntity save(SearchEntity searchEntity) {
        return searchRepository.save(searchEntity);
    }

    public SearchEntity Search(String search, UUID UserId,UUID CategoryId) {
        if(search != null && UserId != null || CategoryId != null) {
            return searchRepository.SearchMechanism(search,UserId,CategoryId).orElse(null);
        }
        return null;
    }

    public void deleteSearch(){
        searchRepository.deleteAll();
    }
}
