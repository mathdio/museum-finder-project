package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Museum controller.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  private final MuseumServiceInterface service;

  public MuseumController(MuseumServiceInterface service) {
    this.service = service;
  }

  /**
   * Create museum response entity.
   *
   * @param creationDto the creation dto
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<MuseumDto> createMuseum(@RequestBody MuseumCreationDto creationDto) {
    Museum convertedMuseum = ModelDtoConverter.dtoToModel(creationDto);
    Museum createdMuseum = this.service.createMuseum(convertedMuseum);
    MuseumDto museumDto = ModelDtoConverter.modelToDto(createdMuseum);

    return ResponseEntity.status(HttpStatus.CREATED).body(museumDto);
  }


  /**
   * Gets closest museum.
   *
   * @param lat       the lat
   * @param lng       the lng
   * @param maxDistKm the max dist km
   * @return the closest museum
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumDto> getClosestMuseum(@RequestParam double lat,
      @RequestParam double lng, @RequestParam(name = "max_dist_km") Double maxDistKm) {
    Coordinate coordinate = new Coordinate(lat, lng);
    Museum closesMuseum = this.service.getClosestMuseum(coordinate, maxDistKm);
    MuseumDto museumDto = ModelDtoConverter.modelToDto(closesMuseum);
    return ResponseEntity.ok(museumDto);
  }
}
