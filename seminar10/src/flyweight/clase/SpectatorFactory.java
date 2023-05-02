package flyweight.clase;

import java.util.HashMap;

public class SpectatorFactory {
    private HashMap<Integer, ISpectator> spectatori;

    public SpectatorFactory() {
        super();
        this.spectatori = new HashMap<>();
    }

    public ISpectator getSpectator(int id, float inaltime, float latime) {
        if (this.spectatori.get(id) != null) {
            return this.spectatori.get(id);
        } else {
            ISpectator spectator = new Spectator(inaltime, latime, id);
            this.spectatori.put(id, spectator);
            return spectator;
        }
    }
}
