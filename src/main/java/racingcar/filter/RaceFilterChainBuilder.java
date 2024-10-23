package racingcar.filter;

import java.util.ArrayList;
import java.util.List;
import racingcar.dto.RaceRequest;
import racingcar.dto.RaceResponse;

public class RaceFilterChainBuilder {
    private final List<Filter<RaceRequest, RaceResponse>> filters = new ArrayList<>();

    public RaceFilterChainBuilder addFilter(Filter<RaceRequest, RaceResponse> filter) {
        if (filter == null) {
            throw new IllegalArgumentException("Filter cannot be null");
        }
        filters.add(filter);
        return this;
    }

    public RaceFilterChain build() {
        return new RaceFilterChain(filters);
    }
}
