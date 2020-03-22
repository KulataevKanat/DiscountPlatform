package kg.DiscountPlatform.service.status;

import kg.DiscountPlatform.entity.Status;
import kg.DiscountPlatform.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Status addStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void deleteById(Long id) {
        statusRepository.deleteById(id);
    }

    @Override
    public Status changeStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public Status findById(Long id) {
        return statusRepository.findById(id).get();
    }

    @Override
    public List<Status> findAllStatusByStatus(String status) {
        return statusRepository.findAllStatusByStatus(status);
    }

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }
}
