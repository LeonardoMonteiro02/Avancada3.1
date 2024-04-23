package com.automacao.avancada31;

import android.location.Location;

public interface LocationCallbackListener {
    void onNewLocationReceived(Location location);
}