package service;

import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.embedika.testcarcatalog.controller.CatalogController;
import ru.embedika.testcarcatalog.domain.Car;
import ru.embedika.testcarcatalog.repository.CatalogRepository;
import ru.embedika.testcarcatalog.service.CatalogServiceImpl;
import java.time.LocalDate;
import java.util.Optional;
import static constants.CarConstants.CORRECT_CAR_1;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class CarCatalogApplicationMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CatalogRepository catalogRepository;

    @SpyBean
    private CatalogServiceImpl catalogService;

    @InjectMocks
    private CatalogController catalogController;

//    @Test
//    public void addCarTest() throws Exception {
//        Car car = CORRECT_CAR_1;
//        Long id = 1L;
//        String publicationDate = LocalDate.now().toString();
//
//        JSONObject jsonCar = new JSONObject();
//        jsonCar.put("id",id);
//        jsonCar.put("stateNumber",CORRECT_CAR_1.getStateNumber());
//        jsonCar.put("model",CORRECT_CAR_1.getModel());
//        jsonCar.put("color",CORRECT_CAR_1.getColor());
//        jsonCar.put("releaseYear",CORRECT_CAR_1.getReleaseYear());
//        jsonCar.put("publicationDate",publicationDate);
//
//        when(catalogRepository.save(any(Car.class))).thenReturn(car);
//        when(catalogRepository.findAll()).thenReturn(car);
//        when(catalogRepository.findById(any(Long.class))).thenReturn(Optional.of(car));
//
//        mockMvc.perform(MockMvcRequestBuilders
//                        .post("/catalog")
//                        .content(jsonCar.toString())
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value(id))
//                .andExpect(jsonPath("$.name").value(car.getStateNumber()));
//    }

//    @Test
//    public void shouldReturnCarByState() throws Exception {
//        when(catalogRepository.findById(any(Long.class))).thenReturn(Optional.of(CORRECT_CAR_1));
//
//        mockMvc.perform(MockMvcRequestBuilders
//                        .post("/catalog")
//                        .content(jsonCar.toString())
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//
//    }

}
