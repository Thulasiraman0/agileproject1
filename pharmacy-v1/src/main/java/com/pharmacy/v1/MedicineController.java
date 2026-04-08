package com.pharmacy.v1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    private List<String> medicines = new ArrayList<>();

    // ✅ Add medicine (GET for browser testing)
    @GetMapping("/add")
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
