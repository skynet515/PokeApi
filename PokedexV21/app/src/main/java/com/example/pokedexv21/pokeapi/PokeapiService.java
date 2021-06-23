package com.example.pokedexv21.pokeapi;

import com.example.pokedexv21.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

   @GET("pokemon")
   Call<PokemonRespuesta> obtenerListaPokemon();


}
