package challanges.orderservice;

import java.time.LocalDateTime;

public interface InformationService {
    void inform (User user, String product, LocalDateTime deliveryDate);
}
