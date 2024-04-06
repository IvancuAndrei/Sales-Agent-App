package ro.mpp2024.salesagentapp.domain.dto;

import java.time.LocalDate;

public record OrderDTO(int user_id, int product_id, int quantity, LocalDate order_date) {
}
