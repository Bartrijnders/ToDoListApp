package Classes;

import Enumerations.RepetitionInterval;

public class Repetition implements Detail {

    private RepetitionInterval repetitionInterval;

    public Repetition(RepetitionInterval repetitionInterval) {
        this.repetitionInterval = repetitionInterval;
    }

    public RepetitionInterval getRepetitionInterval() {
        return repetitionInterval;
    }

    public void setRepetitionInterval(RepetitionInterval repetitionInterval) {
        this.repetitionInterval = repetitionInterval;
    }

    @Override
    public String toString() {
        return "Repetition: " + repetitionInterval;
    }
}
