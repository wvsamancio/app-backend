package backend.app.entities;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    private String id;

    @NotEmpty(message = "Icon is required")
    private String icon;

    @NotEmpty(message = "Content is required")
    private String content;
}
