import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/data")
public class DataController {

@Getmapping("/calculaData")
public ResponseEntity<?> calculaDatas(@RequestBody Object object) {


    return ResponseEntity.ok(object);

}

}
