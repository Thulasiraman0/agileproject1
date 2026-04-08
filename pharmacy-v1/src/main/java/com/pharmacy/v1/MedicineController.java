package com.pharmacy.v1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    // In-memory storage (simple for project/demo)
    private List<String> medicines = new ArrayList<>();

    // ✅ Add medicine
    @PostMapping("/add")
    public String addMedicine(@RequestParam String name) {
        medicines.add(name);
        return "Medicine added: " + name;
    }

    // ✅ View all medicines
    @GetMapping
    public List<String> getAllMedicines() {
        return medicines;
    }
}
