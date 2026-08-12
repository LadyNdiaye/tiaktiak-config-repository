package sn.edu.isapat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/config")
public class configcontroller {

    @Value("${tiaktiak.commande.devise}")
    private String devise;

    @Value("${tiaktiak.commande.montant-minimum}")
    private int montantMinimum;

    @GetMapping
    public Map<String, Object> getConfig() {
        Map<String, Object> config = new HashMap<>();
        config.put("devise", devise);
        config.put("montantMinimum", montantMinimum);
        return config;
    }
}