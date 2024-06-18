package K2LJ.WelCheck_Backend.facilitypackage.controller;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import K2LJ.WelCheck_Backend.facilitypackage.request.FacilityCreate;
import K2LJ.WelCheck_Backend.facilitypackage.request.FacilityEdit;
import K2LJ.WelCheck_Backend.facilitypackage.response.FacilityResponse;
import K2LJ.WelCheck_Backend.facilitypackage.service.FacilityService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FacilityController {

    private final FacilityService facilityService;

    @PostMapping("/facility")
    public void addFacility(@RequestBody @Valid FacilityCreate reqeust){
        facilityService.save(reqeust);
    }

    @GetMapping("/facility/{facilityId}")
    public FacilityResponse getFacility(@PathVariable(name = "facilityId") Long id){
        return facilityService.get(id);
    }

 /*   @GetMapping("/facilitys")
    public List<FacilityResponse> getPage(@ModelAttribute ){

    }*/

    @PatchMapping("/facility/{facilityId}")
    public void edit(@PathVariable(name = "facilityId") Long postId, @RequestBody @Valid FacilityEdit request) {
        facilityService.edit(postId, request);
    }

    @DeleteMapping("/facility/{facilityId}")
    public void delete(@PathVariable(name = "facilityId") Long id) {
        facilityService.delete(id);
    }
}
