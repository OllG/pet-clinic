package pl.olpinski.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.olpinski.petclinic.model.Owner;
import pl.olpinski.petclinic.model.PetType;
import pl.olpinski.petclinic.model.Vet;
import pl.olpinski.petclinic.services.OwnerService;
import pl.olpinski.petclinic.services.PetTypeService;
import pl.olpinski.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType= petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType= petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jeffrey");
        owner2.setLastName("Williams");
        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("John");
        vet1.setLastName("Thompson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mike");
        vet2.setLastName("Tyson");
        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
