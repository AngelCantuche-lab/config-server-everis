package everis.entidadesMongo.entidadesMongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document("Pago")
public class Pago {

        @Id
        private String id;

        @DateTimeFormat(pattern = "yyyy/MM/dd")
        private Date paymentDate;

        private double dinero;
}
