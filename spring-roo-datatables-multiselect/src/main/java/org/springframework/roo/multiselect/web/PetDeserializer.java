package org.springframework.roo.multiselect.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import org.springframework.roo.multiselect.domain.Pet;
import org.springframework.roo.multiselect.service.api.PetService;

/**
 * = PetDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Pet.class)
public class PetDeserializer extends JsonObjectDeserializer<Pet> {

    /**
     * TODO Auto-generated field documentation
     *
     */
    public PetService petService;

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param petService
     * @param conversionService
     */
    @Autowired
    public PetDeserializer(PetService petService, ConversionService conversionService) {
        this.petService = petService;
        this.conversionService = conversionService;
    }
}
