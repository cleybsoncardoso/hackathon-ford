package com.ford.sa.campuspartyexample;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cleyb on 2/3/2018.
 */

class EventHole {

    public String speed;
    public String tanget;

    public EventHole(String speed, String tanget) {
        this.speed = speed;
        this.tanget = tanget;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("speed", speed);
        result.put("tanget", tanget);
        return result;
    }
}
