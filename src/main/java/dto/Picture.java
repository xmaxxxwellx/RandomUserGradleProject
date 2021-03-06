package dto;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Picture {

    @Expose
    private String large;
    @Expose
    private String medium;
    @Expose
    private String thumbnail;
}
