package org.serf.javacore.lesson_11_p2;

public class Car {

    private int horsePower;
    private int produceDate;
    SteeringWheel steeringWheel;
    Engine engine;

    public Car(int horsePower, int produceDate, SteeringWheel steeringWheel, Engine engine) {
        this.horsePower = horsePower;
        this.produceDate = produceDate;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(int produceDate) {
        this.produceDate = produceDate;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", produceDate=" + produceDate +
                ", steeringWheel=" + steeringWheel +
                ", engine=" + engine +
                '}';
    }
}
