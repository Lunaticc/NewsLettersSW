package newsletters.demo.service;

import newsletters.demo.entity.Subscriber;
import newsletters.demo.repository.SubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubService {

    @Autowired
    private SubRepository repo;

    public Subscriber saveSub(Subscriber subscriber){
        return repo.save(subscriber);
    }

    public List<Subscriber> saveSubs(List<Subscriber> subList){
        return repo.saveAll(subList);
    }

    public Subscriber getSubscriber(){

    }
}
