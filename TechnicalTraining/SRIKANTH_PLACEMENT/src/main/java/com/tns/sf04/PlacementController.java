package com.tns.sf04;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class PlacementController {
	@Autowired
	private PlacementService service;
	// RESTful API methods for Retrieval operations
		 @GetMapping("/placement_details")
		 public List<Placement> list() 
		 {
		 return service.listAll();
		 }
		 @GetMapping("/placement_details/{id}")
		 public ResponseEntity<Placement> get(@PathVariable Integer id) 
		 {
		 try
		 {
		 Placement place = service.get(id);
		 return new ResponseEntity<Placement>(place, HttpStatus.OK);
		 } 
		 catch (NoSuchElementException e) 
		 {
		 return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		 } 
		 }
		 // RESTful API method for Create operation
		 @PostMapping("/placement_details")
		 public void add(@RequestBody Placement place) 
		 {
		 service.save(place);
		 }
		 
		 // RESTful API method for Update operation
		 @PutMapping("/placement_details/{id}")
		 public ResponseEntity<?> update(@RequestBody Placement place, @PathVariable Integer id) 
		 {
		 try
		 {
		 Placement placedCompany = service.get(id);
		 service.save(place);
		 return new ResponseEntity<>(HttpStatus.OK);
		 } 
		 catch (NoSuchElementException e) 
		 {
		 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 } 
		 }
		 // RESTful API method for Delete operation
		 @DeleteMapping("/placement_details/{id}")
		 public void delete(@PathVariable Integer id) 
		 {
		 service.delete(id);
		 }
}
	

