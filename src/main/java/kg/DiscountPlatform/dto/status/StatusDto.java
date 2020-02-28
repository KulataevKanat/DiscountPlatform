package kg.DiscountPlatform.dto.status;

import kg.DiscountPlatform.entity.Status;

import java.util.LinkedList;
import java.util.List;

public class StatusDto {
    private Long id;
    private String status;

    public StatusDto(Status status) {
        this.id = status.getId();
        this.status = status.getStatus();
    }

    public static List<StatusDto> toList(List<Status> status) {
        List<StatusDto> result = new LinkedList<>();
        status.forEach(element -> {
            result.add(new StatusDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
