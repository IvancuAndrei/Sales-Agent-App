package ro.mpp2024.salesagentapp.domain.dto;

public record UserDTO(String name, String email, String password, boolean adminFlag) {
}
