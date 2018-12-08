package pl.olpinski.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.olpinski.petclinic.model.Owner;
import pl.olpinski.petclinic.model.Vet;
import pl.olpinski.petclinic.services.OwnerService;
import pl.olpinski.petclinic.services.VetService;
import pl.olpinski.petclinic.services.map.OwnerServiceMap;
import pl.olpinski.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jeffrey");
        owner2.setLastName("Williams");
        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Thompson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Mike");
        vet2.setLastName("Tyson");
        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
