package com.backend_fordon_v2;

import java.util.List;
import java.util.Random;

public class fordonRepo {

    List<String> fordon = List.of("Bil","Båt","Tåg","Cykel", "Moped", "Raket", "Flygplan", "Luftballonng","Sparkcykel", "Skateboard");

    public String getFordon() {
           return fordon.get(new Random().nextInt(0,fordon.size()));
        }
    }

