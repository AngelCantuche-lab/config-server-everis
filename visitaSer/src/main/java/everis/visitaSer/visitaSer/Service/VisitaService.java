package everis.visitaSer.visitaSer.Service;

import com.netflix.discovery.EurekaClient;
import everis.visitaSer.visitaSer.Repository.VisitaRepository;
import everisentidadesSQL.entidadesSQL.domain.Visita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitaService {

    @Autowired
    private VisitaRepository visitaRepository;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    public List<Visita> getVisita() {
        return visitaRepository.findAll();

    }

    public Optional<Visita> getVisitaId(int id) {
        return visitaRepository.findById(id);
    }

    public Visita save(Visita visita) {
        return visitaRepository.save(visita);
    }

    public void delete(Visita visita) {
        visitaRepository.delete(visita);

    }

    public void deleteById(int id) {
        visitaRepository.deleteById(id);

    }
}
