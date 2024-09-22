package com.app.PetCareBE.function;

import com.app.PetCareBE.model.Manager;
import com.app.PetCareBE.model.Pet;
import com.app.PetCareBE.model.PetCareCenter;
import com.app.PetCareBE.model.PetOwner;
import com.app.PetCareBE.model.Document;
import com.app.PetCareBE.model.PetService;




import com.app.PetCareBE.enums.PetServiceType;
import com.app.PetCareBE.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  