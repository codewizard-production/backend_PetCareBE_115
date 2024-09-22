package com.app.PetCareBE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.PetCareBE.model.Manager;
import com.app.PetCareBE.model.Pet;
import com.app.PetCareBE.model.PetCareCenter;
import com.app.PetCareBE.model.PetOwner;
import com.app.PetCareBE.model.Document;
import com.app.PetCareBE.model.PetService;
import com.app.PetCareBE.enums.PetServiceType;
import com.app.PetCareBE.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcarebe\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}