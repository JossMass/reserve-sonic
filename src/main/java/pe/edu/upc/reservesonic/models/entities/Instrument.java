package pe.edu.upc.reservesonic.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Instruments")
public class Instrument {
@Id
	//Attributes declaration
	@Column(name = "instrument_id", length = 5, nullable = false)
	private String id;

	@Column(name = "name", length = 20, nullable = false)
	private String name;
	
	@Column(name = "brand", length = 20, nullable = false)
	private String brand;
	
	@Column(name = "description", length = 120, nullable = false)
	private String description;
	
	//@ManyToOne
	//@JoinColumn(name = "room_id")
	//private Room room;
}