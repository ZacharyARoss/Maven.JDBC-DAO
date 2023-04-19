import java.util.List;

import daos.CarDAO;
import models.CarDTO;

public class AppRunner {
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();
        System.out.print(carDAO.findById(1));

        CarDTO newCar = new CarDTO(2, "Ferrari", "Enzo", "red", 2023, "XYZ456");
        CarDTO createdCar = carDAO.create(newCar);
        System.out.println("Created car: " + createdCar);
    
        // Find a car by ID
        CarDTO foundCar = carDAO.findById(2);
        System.out.println("Found car: " + foundCar);
    
        // Find all cars
        List<CarDTO> allCars = carDAO.findAll();
        System.out.println("All cars: " + allCars);
    
        // Update a car
        foundCar.setModel("Corolla");
        CarDTO updatedCar = carDAO.update(foundCar);
        System.out.println("Updated car: " + updatedCar);
    
        // Delete a car
        carDAO.delete(1);
        System.out.println("Car deleted.");

    }
   
}

