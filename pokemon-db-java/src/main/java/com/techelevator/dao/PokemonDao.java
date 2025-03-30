package com.techelevator.dao;

import com.techelevator.models.PokemonDetail;

import java.util.List;

public interface PokemonDao {
    // abstract method -- no bodies!
    // CRUD

    // create
    PokemonDetail saveFavorites(PokemonDetail detail, int userId);
    // read
    List<PokemonDetail> getAllFavorites(int userId);
}
