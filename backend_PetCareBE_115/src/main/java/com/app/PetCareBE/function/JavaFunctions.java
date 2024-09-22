package com.app.PetCareBE.function;

import com.app.PetCareBE.model.Manager;
import com.app.PetCareBE.model.Pet;
import com.app.PetCareBE.model.PetCareCenter;
import com.app.PetCareBE.model.PetOwner;
import com.app.PetCareBE.model.Document;
import com.app.PetCareBE.model.PetService;
import com.app.PetCareBE.enums.PetServiceType;
import com.app.PetCareBE.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.PetCareBE.repository.PetServiceRepository;
import com.app.PetCareBE.repository.PetOwnerRepository;
import com.app.PetCareBE.repository.PetCareCenterRepository;
import com.app.PetCareBE.repository.ManagerRepository;
import com.app.PetCareBE.repository.DocumentRepository;
import com.app.PetCareBE.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
