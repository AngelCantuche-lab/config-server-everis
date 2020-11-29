package everis.entidadesMongo.entidadesMongo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("factura")
public class Factura {

    @Id
    private String id;

    private String formaPago;

    private List<Integer> lineasFactura;

    private String estados;

}
