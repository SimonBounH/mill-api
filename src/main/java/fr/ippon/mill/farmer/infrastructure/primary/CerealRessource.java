package fr.ippon.mill.farmer.infrastructure.primary;

import fr.ippon.mill.farmer.domain.Cereal;
import fr.ippon.mill.farmer.domain.Farmer;
import fr.ippon.mill.farmer.domain.FarmerAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(CerealRessource.CEREAL_API_URI)
@Validated
public class CerealRessource {

    public static final String CEREAL_API_URI = "/api/cereals";

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid CreateCerealRequest newCereal) {
        Cereal cereal = Cereal.add(newCereal.getTypeOfCereal(), newCereal.geti, newCereal.getEmail(), newCereal.getPhoneNumber());
        try {
            /*String reference = farmerService.register(farmer);
            String locationUri = String.format("%s/%s", FARMER_API_URI, reference);
            return ResponseEntity.created(URI.create(locationUri)).build();*/
        } catch (FarmerAlreadyExistsException farmerAlreadyExistsException) {
            /*return ResponseEntity.status(HttpStatus.CONFLICT).build();*/
        }
    }
}