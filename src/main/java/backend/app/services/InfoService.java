package backend.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.app.entities.Info;
import backend.app.repositories.InfoRepository;

@Service
public class InfoService {
    @Autowired
    private final InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public List<Info> getAll() {
        return infoRepository.findAll();
    }

    public Info get(String id) {
        return infoRepository.findById(id).get();
    }

    public Info save(Info info) {
        return infoRepository.save(info);
    }

    public Info update(Info info) {
        return infoRepository.save(info);
    }

    public void delete(String id) {
        infoRepository.deleteById(id);
    }
}
