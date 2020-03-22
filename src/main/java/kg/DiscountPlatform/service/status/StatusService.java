package kg.DiscountPlatform.service.status;

import kg.DiscountPlatform.entity.Status;

import java.util.List;

public interface StatusService {
    Status addStatus(Status status);

    void deleteById(Long id);

    Status changeStatus(Status status);

    Status findById(Long id);

    List<Status> findAllStatusByStatus(String status);

    List<Status> findAll();
}
