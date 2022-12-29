package ch.bbw.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="${client.url}")
@RequestMapping("api")
public class RefCard05RestController {

    private int counter = 1;

    @GetMapping()
    public ResponseEntity<Message> hello() {
        counter++;
        return ResponseEntity.ok(
                new Message("Hello World (Ref. Card 05) - " + counter));
    }
}
