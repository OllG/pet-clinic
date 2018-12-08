package pl.olpinski.petclinic.services;

import pl.olpinski.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
