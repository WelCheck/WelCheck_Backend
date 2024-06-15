package K2LJ.WelCheck_Backend.facilitypackage.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.max;
import static java.lang.Math.min;


@Builder
@Getter
@Setter
public class Search {
    private static final int MAX_SIZE = 200;

    @Builder.Default
    private Integer page = 1;

    @Builder.Default
    private Integer size = 10;

    public long getOffset(){
        return (long)(max(1,page )- 1) * min(size, MAX_SIZE);
    }
}
